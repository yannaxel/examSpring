package com.example.demo.services;

import com.example.demo.models.Question;
import com.example.demo.repositories.QuestionRepository;

import java.util.List;
import java.util.Optional;

public class QuestionServiceImpl implements QuestionService {
    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> findAll() {
        return this.questionRepository.findAll();
    }

    @Override
    public Question save(Question question) {
        return this.questionRepository.save(question);
    }

    @Override
    public Optional<Question> findById(Long id) {
        return this.questionRepository.findById(id);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void delete(Long id) {
        this.questionRepository.deleteById(id);
    }

    @Override
    public Question update(Question question) {
        return this.questionRepository.save(question);
    }
}

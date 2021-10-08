package com.example.demo.services;

import com.example.demo.models.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    public List<Question> findAll();

    public Question save(Question question);

    public Optional<Question> findById(Long id);

    public void delete(Integer id);

    void delete(Long id);

    public Question update(Question question);
}

package com.example.demo.controllers;

import com.example.demo.models.Question;
import com.example.demo.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("questions")
@CrossOrigin
public class QuestionController {
    private QuestionService questionService;

    public QuestionController() {
    }

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> findAll(){
        return this.questionService.findAll();
    }

    @PostMapping
    public Question save(@RequestBody Question question){
        return this.questionService.save(question);
    }

    @GetMapping("{id}")
    public Optional<Question> findById(@PathVariable Long id){
        return this.questionService.findById(id);
    }

    @PutMapping
    public Question update(@RequestBody Question question){
        return this.questionService.update(question);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.questionService.delete(id);
    }
}

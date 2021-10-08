package com.example.demo;

import com.example.demo.repositories.QuestionRepository;
import com.example.demo.repositories.SerieRepository;
import com.example.demo.services.QuestionService;
import com.example.demo.services.QuestionServiceImpl;
import com.example.demo.services.SerieService;
import com.example.demo.services.SerieServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SerieService serieService(SerieRepository serieRepository){
        return new SerieServiceImpl(serieRepository);
    }

    @Bean
    public QuestionService questionService(QuestionRepository questionRepository)
    {
        return new QuestionServiceImpl(questionRepository);
    }
}

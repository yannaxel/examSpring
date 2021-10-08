package com.example.demo.services;

import com.example.demo.models.Serie;
import com.example.demo.repositories.SerieRepository;

import java.util.List;
import java.util.Optional;

public class SerieServiceImpl implements SerieService {
    private SerieRepository serieRepository;

    public SerieServiceImpl(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public List<Serie> findAll() {
        return this.serieRepository.findAll();
    }

    @Override
    public Serie save(Serie serie) {
        return this.serieRepository.save(serie);
    }

    @Override
    public Optional<Serie> findById(Long id) {
        return this.serieRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        this.serieRepository.deleteById(id);
    }

    @Override
    public Serie update(Serie serie) {
        return this.serieRepository.save(serie);
    }
}

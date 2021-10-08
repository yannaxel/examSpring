package com.example.demo.services;

import com.example.demo.models.Serie;

import java.util.List;
import java.util.Optional;

public interface SerieService {
    public List<Serie> findAll();

    public Serie save(Serie serie);

    public Optional<Serie> findById(Long id);

    public void delete(Long id);

    public Serie update(Serie serie);
}

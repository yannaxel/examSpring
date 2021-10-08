package com.example.demo.controllers;

import com.example.demo.models.Serie;
import com.example.demo.services.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("series")
@CrossOrigin
public class SerieController {
    private SerieService serieService;

    public SerieController() {
    }

    @Autowired
    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public List<Serie> findAll(){
        return this.serieService.findAll();
    }

    @PostMapping
    public Serie save(@RequestBody Serie serie){
        return this.serieService.save(serie);
    }

    @GetMapping("{id}")
    public Optional<Serie> findById(@PathVariable Long id){
        return this.serieService.findById(id);
    }

    @PutMapping
    public Serie update(@RequestBody Serie serie){
        return this.serieService.update(serie);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        this.serieService.delete(id);
    }
}

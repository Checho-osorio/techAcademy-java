package com.example.library.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Movie;
import com.example.library.services.MovieServices;

@RestController
@RequestMapping({"movie"})
public class MovieController {
    private final MovieServices movieServices;

    public MovieController(MovieServices movieServices) {
        this.movieServices = movieServices;
    }

    @GetMapping("")
    public List<Movie> getAll()
    {
        return movieServices.getAll();
    }

    @GetMapping("/{movieId}")
    public Movie get(@PathVariable String movieId)
    {
        return movieServices.get(movieId);
    }

    @PostMapping("")
    public Movie addMovie(@RequestBody Movie movie)
    {
        return movieServices.addMovie(movie);
    }

    @PutMapping("/{movieId}")
    public Movie addMovie(@PathVariable String movieId, @RequestBody Movie movie)
    {
        return movieServices.updateMovie(movieId, movie);
    }

    @DeleteMapping("/{movieId}")
    public Movie addMovie(@PathVariable String movieId)
    {
        return movieServices.deleteMovie(movieId);
    }
}

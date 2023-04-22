package com.example.library.repository;

import java.util.List;

import com.example.library.model.Movie;

public interface IMovieRepository {
    public List<Movie> getAll();
    public Movie get(String movieId);
    public Movie save(Movie movie);
    public Movie delete(String movieId);
}

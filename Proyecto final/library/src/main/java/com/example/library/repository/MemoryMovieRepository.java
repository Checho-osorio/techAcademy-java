package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.library.model.Movie;

@Repository
public class MemoryMovieRepository  implements IMovieRepository {

    private Map<String, Movie> movieMap;


    MemoryMovieRepository() {
        movieMap = new HashMap<>();
    }



    @Override
    public List<Movie> getAll() {
        List<Movie> ret = new ArrayList<>();
        ret.addAll(movieMap.values());
        return ret;
    }

    @Override
    public Movie get(String movieId) {
       return movieMap.get(movieId);
    }

    @Override
    public Movie save(Movie movie) {
        if (movie.getMovieId() == null)
        {
            movie.setMovieId(String.valueOf(System.currentTimeMillis()));    
        }

        return movieMap.put(movie.getMovieId(), movie);
    }

    @Override
    public Movie delete(String movieId) {
        return movieMap.remove(movieId);
    }
    
}

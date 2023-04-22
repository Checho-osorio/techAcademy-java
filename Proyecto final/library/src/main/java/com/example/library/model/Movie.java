package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Movie {
    private String movieId;
    private String title;
    private String sinopsis;
    private String author;
    private String year;
    private String qualification;
    private String movieGenre;
    public Movie( String title, String sinopsis, String author, String year, String qualification,
            String movieGenre) {
        this.title = title;
        this.sinopsis = sinopsis;
        this.author = author;
        this.year = year;
        this.qualification = qualification;
        this.movieGenre = movieGenre;
    }

    



    
}


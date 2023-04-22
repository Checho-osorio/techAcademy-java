package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Movie;
import com.example.library.services.MovieServices;

import jakarta.annotation.PostConstruct;

@Component
public class MovieFiller {
    private final MovieServices movieServices;
    
    public MovieFiller(MovieServices movieServices) {
        this.movieServices = movieServices;
    }

    @PostConstruct
    public void init(){
        Movie movie1 = new Movie( "El Padrino",
            "La historia se centra en la familia Corleone, liderada por Vito Corleone, un poderoso jefe mafioso de Nueva York. La trama sigue la vida de la familia en el mundo del crimen organizado y cómo luchan por mantener su poder en un mundo violento y peligroso." ,
             "Mario Puzo", 
             "1972", 
             "9.2", 
             "Drama/Crimen");
        movieServices.addMovie(movie1);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        Movie movie2 = new Movie( "Forrest Gump",
            "Forrest Gump es un hombre con un coeficiente intelectual bajo, pero una gran bondad y corazón. A pesar de sus limitaciones, vive una vida excepcional, viajando por todo el mundo y encontrándose con algunas de las figuras más influyentes de la historia moderna." ,
             "Winston Groom", 
             "1994", 
             "8.8", 
             "Drama/Comedia");
        movieServices.addMovie(movie2);
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        Movie movie3 = new Movie( "El Señor de los Anillos: El Retorno del Rey",
        "En esta entrega final de la trilogía, la guerra entre los humanos y las fuerzas del mal lideradas por Sauron llega a su clímax. Frodo y Sam deben llegar al Monte del Destino para destruir el Anillo Único, mientras que el resto de los personajes luchan en la Batalla de los Campos del Pelennor." ,
         "J.R.R. Tolkien", 
         "2003", 
         "9.0", 
         "Fantasía/Aventura");
        movieServices.addMovie(movie3);
   
    }
}

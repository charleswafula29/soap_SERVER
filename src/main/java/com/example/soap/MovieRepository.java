package com.example.soap;

import models.Category;
import models.Movie;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieRepository{

    public static Map<String, Movie> movis = new HashMap<>();

    @PostConstruct
    public void populateHashMap(){
        Movie movie = new Movie();
        movie.setName("Batman");
        movie.setCategory(Category.HORROR);
        movie.setYearReleased("2019");

        Movie movie2 = new Movie();
        movie.setName("Ruth");
        movie.setCategory(Category.THRILLER);
        movie.setYearReleased("2019");

        Movie movie3 = new Movie();
        movie.setName("Superman");
        movie.setCategory(Category.SYFY);
        movie.setYearReleased("2018");

        movis.put(movie.getName(),movie);
        movis.put(movie2.getName(),movie2);
        movis.put(movie3.getName(),movie3);
    }

    public Movie getMovie(String name){
        return movis.get(name);
    }


}

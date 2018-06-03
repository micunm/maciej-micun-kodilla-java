package com.kodilla.good.patterns.challenges;

import java.lang.*;
import java.util.stream.Collectors;

public class MovieStoreApplication {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String moviesString=movieStore.getMovies().entrySet().stream()
                .map(entry -> entry.getValue().toString())
                .collect(Collectors.joining("! "));

        System.out.println(moviesString);
    }
}
package com.kodilla.good.patterns.challenges;

import java.lang.*;

public class MovieStoreApplication {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieString=movieStore.getMovies().entrySet().stream()
               // .map(entry -> entry.getKey() + "! "+entry.getValue()+" ! ")
                .map(entry -> entry.getValue()+" ! ")
                .forEach(System.out::println);
    }
}
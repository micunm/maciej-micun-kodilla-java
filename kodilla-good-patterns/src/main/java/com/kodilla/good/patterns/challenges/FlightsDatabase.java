package com.kodilla.good.patterns.challenges;

import java.util.HashSet;

public final class FlightsDatabase {
    private final HashSet<Flight> flights=new HashSet<Flight>();

    public FlightsDatabase() {

        Flight flight1 = new Flight("Warszawa", "Gdańsk");
        Flight flight2 = new Flight("Gdańsk", "Warszawa");
        Flight flight3 = new Flight("Warszawa", "Wrocław");
        Flight flight4 = new Flight("Wrocław", "Kraków");
        Flight flight5 = new Flight("Warszawa", "Kraków");
        Flight flight6 = new Flight("Kraków", "Gdańsk");
        Flight flight7 = new Flight("Warszawa", "Berlin");
        Flight flight8 = new Flight("Gdańsk", "Berlin");
        Flight flight9 = new Flight("Berlin", "Gdańsk");
        Flight flight10 = new Flight("Praga", "Gdańsk");
        Flight flight11 = new Flight("Helsinki", "Gdańsk");
        Flight flight12 = new Flight("Wilno", "Gdańsk");
        Flight flight13 = new Flight("Warszawa", "Gdańsk");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        flights.add(flight7);
        flights.add(flight8);
        flights.add(flight9);
        flights.add(flight10);
        flights.add(flight11);
        flights.add(flight12);
        flights.add(flight13);
    }

    public HashSet<Flight> getFlightsSet() {
        return new HashSet<>(flights);
    }
}


package com.kodilla.good.patterns.challenges;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        FlightsDatabase flightsDatabase=new FlightsDatabase();
        FlightProcessor fp=new FlightProcessor();
        fp.processFrom(flightsDatabase.getFlightsSet(), "Gdańsk");
        fp.processTo(flightsDatabase.getFlightsSet(), "Warszawa");
        fp.processToFromWithChange(flightsDatabase.getFlightsSet(), "Wrocław", "Gdańsk", "Warszawa");
        fp.processToFromWithChange(flightsDatabase.getFlightsSet(), "Kraków", "Gdańsk", "Wrocław");
    }
}

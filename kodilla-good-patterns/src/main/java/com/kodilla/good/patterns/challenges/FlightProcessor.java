package com.kodilla.good.patterns.challenges;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {
    public void processFrom (HashSet<Flight> flightsSet, String departureAirport) {
        System.out.println("Searching for flights from: "+departureAirport);
        flightsSet.stream()
                .filter(f->f.getDepartureAirport()==departureAirport)
                .forEach(System.out::println);
    }
    public void processTo (HashSet<Flight> flightsSet, String arrivalAirport) {
        System.out.println("Searching for flights to: "+arrivalAirport);
        flightsSet.stream()
                .filter(f->f.getArrivalAirport()==arrivalAirport)
                .forEach(System.out::println);
    }
    public void processToFromWithChange (HashSet<Flight> flightsSet, String departureAirport, String arrivalAirport, String changeAirport) {
        System.out.println("Searching for flights from: "+departureAirport+" to: "+arrivalAirport+" with change in: "+changeAirport);
        Set<Flight> result1=flightsSet.stream()
                .filter(f->f.getDepartureAirport()==departureAirport && f.getArrivalAirport()==changeAirport)
                .collect(Collectors.toSet());
        if(result1.size()>0) {
            System.out.println(result1);
            flightsSet.stream()
                    .filter(f->f.getDepartureAirport()==changeAirport)
                    .filter(g->g.getArrivalAirport()==arrivalAirport)
                    .forEach(System.out::println);
        } else {
            System.out.println("There is no flights fulfilling given conditions");
        }
    }

}

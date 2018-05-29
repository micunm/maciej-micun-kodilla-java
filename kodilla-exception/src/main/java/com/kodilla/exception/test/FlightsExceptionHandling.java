package com.kodilla.exception.test;

public class FlightsExceptionHandling {
    public static void main(String args[]) {
        Flight flight1=new Flight("Warsaw", "Mexico");
        Flight flight2=new Flight("Gdansk", "New York");
        Flight flight3=new Flight("Gdansk", "Porto");

        FlightsSearcher flightSearcher=new FlightsSearcher();
        //String isFlightFoundText="No flights to given destination.";
        boolean isFlightFoundText=false;

        try {
            System.out.println("Searching for flights..");
            isFlightFoundText=flightSearcher.findFlight(flight2);
            System.out.println(isFlightFoundText);
        } catch (Exception x) {
            System.out.println("Try with different destination.");
        }
    }
}

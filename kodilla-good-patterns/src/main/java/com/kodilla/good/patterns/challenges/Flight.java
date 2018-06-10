package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Flight {
    private String arrivalAirport;
    private String departureAirport;

    public Flight(String arrivalAirport, String departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrivalAirport, flight.arrivalAirport) &&
                Objects.equals(departureAirport, flight.departureAirport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalAirport, departureAirport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                '}';
    }
}

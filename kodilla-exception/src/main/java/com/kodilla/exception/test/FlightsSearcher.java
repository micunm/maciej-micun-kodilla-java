package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearcher {

    public String findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsMap=new HashMap<>();
        String returnString="Flight not found.";

        flightsMap.put("Porto",true);
        flightsMap.put("Gran Canaria", true);
        flightsMap.put("Warsaw", true);
        flightsMap.put("Sydney", false);
        flightsMap.put("New Jersey", false);
        flightsMap.put("Poznan", true);

        boolean searchResult = flightsMap.get(flight.getArrivalAirport());
        if (searchResult==false) {
            throw new RouteNotFoundException();
        } else {
            returnString="Flight founded!";
        }
        return returnString;
    }
}

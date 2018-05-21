package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private String continentName;
    List<Country> countries=new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public List<Country> getCountryList() {
        return countries;
    }

}

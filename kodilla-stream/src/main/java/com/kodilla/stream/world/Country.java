package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private String countryName;
    private BigDecimal population;

    public Country(String countryName, BigDecimal population) {
        this.countryName = countryName;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    };
}

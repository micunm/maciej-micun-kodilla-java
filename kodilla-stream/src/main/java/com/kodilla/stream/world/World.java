package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public BigDecimal getPeopleQuantity() {
        List<Continent> continents=new ArrayList<>();
        continents.add(new Continent("Europe"));
        continents.add(new Continent("Asia"));
        continents.add(new Continent("Australia"));
        continents.add(new Continent("North America"));
        continents.add(new Continent("South America"));
        continents.add(new Continent("Africa"));

       //add countries to Europe
        continents.get(0).addCountry(new Country ("Poland", new BigDecimal("38420021")));
        continents.get(0).addCountry(new Country ("Germany", new BigDecimal("82820000")));
        continents.get(0).addCountry(new Country ("France", new BigDecimal("67230010")));
        continents.get(0).addCountry(new Country ("England", new BigDecimal("56420045")));
        continents.get(0).addCountry(new Country ("Spain", new BigDecimal("46354321")));
        continents.get(0).addCountry(new Country ("Italy", new BigDecimal("60580100")));
        //add countries to Asia
        continents.get(1).addCountry(new Country ("China", new BigDecimal("1408420021")));
        continents.get(1).addCountry(new Country ("India", new BigDecimal("1323820000")));
        continents.get(1).addCountry(new Country ("Indonesia", new BigDecimal("261230010")));
        continents.get(1).addCountry(new Country ("Pakistan", new BigDecimal("211420045")));
        continents.get(1).addCountry(new Country ("Bangladesh", new BigDecimal("162954321")));
        continents.get(1).addCountry(new Country ("Russia", new BigDecimal("143960100")));
        //add countries to Australia
        continents.get(2).addCountry(new Country ("Australia", new BigDecimal("24942002")));
        continents.get(2).addCountry(new Country ("Papua New Guinea", new BigDecimal("8082000")));

        //add countries to North America
        continents.get(3).addCountry(new Country ("United States", new BigDecimal("322842001")));
        continents.get(3).addCountry(new Country ("Mexico", new BigDecimal("127509000")));
        continents.get(3).addCountry(new Country ("Canada", new BigDecimal("36289010")));
        continents.get(3).addCountry(new Country ("Guatemala", new BigDecimal("16420045")));
        continents.get(3).addCountry(new Country ("Cuba", new BigDecimal("11454321")));
        continents.get(3).addCountry(new Country ("Haiti", new BigDecimal("10580100")));
        //add countries to South America
        continents.get(4).addCountry(new Country ("Brazil", new BigDecimal("207420021")));
        continents.get(4).addCountry(new Country ("Colombia", new BigDecimal("48220000")));
        continents.get(4).addCountry(new Country ("Argentina", new BigDecimal("43723001")));
        continents.get(4).addCountry(new Country ("Peru", new BigDecimal("31773045")));
        continents.get(4).addCountry(new Country ("Venezuela", new BigDecimal("31568321")));
        continents.get(4).addCountry(new Country ("Chile", new BigDecimal("17909754")));
        //add countries to Africa
        continents.get(5).addCountry(new Country ("Egypt", new BigDecimal("82868000")));
        continents.get(5).addCountry(new Country ("Ethiopia", new BigDecimal("84320987")));
        continents.get(5).addCountry(new Country ("South Africa", new BigDecimal("51770560")));
        continents.get(5).addCountry(new Country ("Nigeria", new BigDecimal("166629000")));
        continents.get(5).addCountry(new Country ("Congo", new BigDecimal("69575000")));
        continents.get(5).addCountry(new Country ("Tanzania", new BigDecimal("44929002")));

        BigDecimal totalPopulation = continents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPopulation;
    }
}

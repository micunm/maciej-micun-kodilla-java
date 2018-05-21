package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world=new World();
        //When
        BigDecimal totalPopulation=world.getPeopleQuantity();
        //Then
        BigDecimal expectedTotalPopulation=new BigDecimal("5302454164");
        Assert.assertEquals(expectedTotalPopulation, totalPopulation);
    }
}

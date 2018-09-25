package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaDecoratorTestSuite {
    @Test
    public void testBasicOrderPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal("15"), theCost);
    }
    @Test
    public void testBasicOrderPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Italian Pizza with:\n-thin dough\n-tomato sauce \n-cheese\n", description);
    }
    @Test
    public void testDoubleCheesePizzaGetPrice() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal("21"), theCost);
    }
    @Test
    public void testDoubleCheesePizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Italian Pizza with:\n-thin dough\n-tomato sauce \n-cheese\n-double cheese\n", description);
    }
    @Test
    public void testDoubleCheeseWithOnionPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal("23"), theCost);
    }
    @Test
    public void testDoubleCheeseWithOnionPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new DoubleCheeseDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        System.out.println(thePizza.getDescription());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Italian Pizza with:\n-thin dough\n-tomato sauce \n-cheese\n-double cheese\n-onion\n", description);
    }
    @Test
    public void testSalamiWithOnionChilliPeppersOlivesPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        thePizza=new ChilliPeppersDecorator(thePizza);
        thePizza=new OlivesDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal("32"), theCost);
    }
    @Test
    public void testSalamiWithOnionChilliPeppersOlivesPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new SalamiDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        thePizza=new ChilliPeppersDecorator(thePizza);
        thePizza=new OlivesDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Italian Pizza with:\n-thin dough\n-tomato sauce \n-cheese\n-salami\n-onion\n-chilli peppers\n-olives\n", description);
    }
    @Test
    public void testChickenWithBaconOnionChilliPeppersPizzaGetCost() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ChickenDecorator(thePizza);
        thePizza=new BaconDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        thePizza=new ChilliPeppersDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal("31"), theCost);
    }
    @Test
    public void testChickenWithBaconOnionChilliPeppersPizzaGetDescription() {
        //Given
        PizzaOrder thePizza = new BasicPizzaOrder();
        thePizza = new ChickenDecorator(thePizza);
        thePizza=new BaconDecorator(thePizza);
        thePizza = new OnionDecorator(thePizza);
        thePizza=new ChilliPeppersDecorator(thePizza);
        System.out.println(thePizza.getCost());
        //When
        String description = thePizza.getDescription();
        //Then
        assertEquals("Italian Pizza with:\n-thin dough\n-tomato sauce \n-cheese\n-chicken\n-bacon\n-onion\n-chilli peppers\n", description);
    }
}

package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("ONION")
                .burgers(2)
                .sauce(Sauce.BARBECUE)
                .ingredient("SHRIMP")
                .ingredient("LETTUCE")
                .ingredient("CHEESE")
                .bun(Bun.PLAIN)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients()
                .getIngredients().size();
        int howManyBurgers=bigmac.getBurgers();
        String bunType=bigmac.getBun().getBunType();
        String sauce=bigmac.getSauce().getSauce();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("PLAIN", bunType);
        Assert.assertEquals("BARBECUE", sauce);
    }
}
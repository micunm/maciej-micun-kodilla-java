package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations() {
        //Given

/*        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);*/
        //When
        double addResult=calculator.add(7, 5);
        double subResult=calculator.sub(7, 5);
        double mulResult=calculator.mul(12.5, 4);
        double divResult=calculator.div(12.5, 5);
        //Then
        Assert.assertEquals(12, addResult, 0.00001);
        Assert.assertEquals(2, subResult, 0.00001);
        Assert.assertEquals(50, mulResult, 0.00001);
        Assert.assertEquals(2.5, divResult, 0.00001);
    }
}

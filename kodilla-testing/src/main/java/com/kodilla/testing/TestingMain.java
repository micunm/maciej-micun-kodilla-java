package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");
        Calculator simpleCalc=new Calculator();

        int sumResult=simpleCalc.add(12, 8);

        if (sumResult==20) {
            System.out.println("test OK");
        } else {
            System.out.println("test NOK");
        }

        int subResult=simpleCalc.substract(12, 7);

        if (subResult==5) {
            System.out.println("test OK");
        } else {
            System.out.println("test NOK");
        }


    }
}

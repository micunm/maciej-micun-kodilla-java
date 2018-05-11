package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList () {
        //Given
        ArrayList<Integer> testArray=new ArrayList<Integer>();
        OddNumbersExterminator testExterminator=new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultArray = testExterminator.exterminate(testArray);
        System.out.println("Testing " + resultArray);
        //Then
        Assert.assertEquals(resultArray, testArray);
    }
    @Test
    public void testOddNumbersExterminatorNormalList () {
        //Given
        ArrayList<Integer> testArray=new ArrayList<Integer>();
        OddNumbersExterminator testExterminator=new OddNumbersExterminator();
        for (int i=0; i<23; i++) {
            testArray.add(i);
        }
        //When
        //ArrayList<Integer> resultArray = testExterminator.exterminate(testArray);
        ArrayList<Integer> resultArray=new ArrayList<>();
        for (int n=0; n<testArray.size(); n++) {
            if ((testArray.get(n))%2==0) {
                resultArray.add(testArray.get(n));
            }
        }
        System.out.println("Testing " + testArray);
        //Then
        Assert.assertEquals(resultArray, testExterminator.exterminate(testArray));
    }
}

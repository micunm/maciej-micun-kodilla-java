package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] numbers={1, 2, 4, 6, 8, 10, 11, 12, 21, 22, 5, 7, 8, 3, 10, 12, 9, 0, 20, 22};

        //When
        double averageTableElem=ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(9.65, averageTableElem, 0.00000001);
    }
}

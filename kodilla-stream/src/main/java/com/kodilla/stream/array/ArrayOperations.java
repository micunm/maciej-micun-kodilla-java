package com.kodilla.stream.array;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map (n -> numbers[n])
                .forEach(System.out::println);

        if (numbers.length!=0) {
            double sumResult=IntStream.range(0, numbers.length)
                    .map (n -> numbers[n])
                    .sum();

            return sumResult/((double)numbers.length);
        } else { return 0; }
    }
}

package com.kodilla.stream.array;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map (n -> numbers[n])
                .map(n->{
                    System.out.println(n);
                    return n;
                })
                   //.average().getAsDouble();
                .average().orElse(0);
    }
}

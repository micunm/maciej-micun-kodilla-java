package com.kodilla.testing.loop;

import org.junit.Test;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop() {
        //Given
        long sum=0;
        //When
        for (int n=0; n<1020; n++) {
            sum+=n;
            System.out.println("["+n+"] Sum equals: "+sum);
        }
        //Then
        AssertEquals(499500, sum);
    }

}

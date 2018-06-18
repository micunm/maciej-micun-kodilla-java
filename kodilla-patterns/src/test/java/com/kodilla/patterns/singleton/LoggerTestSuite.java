package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given
//        Logger logger=new Logger();
//        logger.log("Logger created...");
        Logger.getInstance().log("Logger created...");
        //When
        String logString=Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals(logString, "Logger created...");
    }
}

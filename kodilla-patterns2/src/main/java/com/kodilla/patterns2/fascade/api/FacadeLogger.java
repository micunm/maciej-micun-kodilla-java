package com.kodilla.patterns2.fascade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeLogger.class);

    @Before("execution(* com.kodilla.patterns2.fascade.api.OrderFacade.processOrder(..))" +
            "&& target(object)")
    public void logFacade(Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " request to processOrder() method");
    }
}

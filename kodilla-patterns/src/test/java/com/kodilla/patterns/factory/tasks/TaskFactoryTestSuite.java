package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPING);
        boolean isDone=shopping.executeTask();
        //Then
        Assert.assertEquals("Shopping!", shopping.getTaskName());
        Assert.assertEquals(true, shopping.isTaskExecuted(isDone));
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVING);
        boolean isDone=driving.executeTask();
        //Then
        Assert.assertEquals("Driving!", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted(isDone));
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTING);
        boolean isDone=painting.executeTask();
        //Then
        Assert.assertEquals("Painting!", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted(isDone));
    }
}

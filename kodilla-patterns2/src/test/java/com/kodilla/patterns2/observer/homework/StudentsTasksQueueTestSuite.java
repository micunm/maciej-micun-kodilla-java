package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentsTasksQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentsTasksQueue tasksQueue1 = new StudentsTasksQueue("Michael Obaba");
        StudentsTasksQueue tasksQueue2 = new StudentsTasksQueue("Alex Punto");
        StudentsTasksQueue tasksQueue3 = new StudentsTasksQueue("Ali Baba");
        StudentsTasksQueue tasksQueue4 = new StudentsTasksQueue("Me Moo");
        Mentor mentor1 = new Mentor("John Rambo");
        Mentor mentor2 = new Mentor("Neo Matrix");
        tasksQueue1.registerObserver(mentor1);
        tasksQueue2.registerObserver(mentor1);
        tasksQueue3.registerObserver(mentor2);
        tasksQueue4.registerObserver(mentor1);
        //When
        tasksQueue1.sendTask("Spring Intro");
        tasksQueue1.sendTask("Rest application");
        tasksQueue2.sendTask("Big Decimal");
        tasksQueue2.sendTask("JQuery");
        tasksQueue2.sendTask("Loops");
        tasksQueue2.sendTask("Lambda expressions");
        tasksQueue3.sendTask("Aspect programming");
        tasksQueue4.sendTask("Design pattern Facade");
        tasksQueue4.sendTask("Design pattern observer");
        tasksQueue1.sendTask("Interfaces");

        assertEquals(9, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
    }
}

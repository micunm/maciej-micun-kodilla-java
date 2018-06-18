package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd(){
        //Given
//        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
//        Board board = context.getBean(Board.class);
        board.getDoneList().addTaskToList("Java course task 10.2");
        board.getToDoList().addTaskToList("Java course module 11 tasks");
        board.getInProgressList().addTaskToList("Java course task 10.3");
        //When
        String taskToDo=board.getToDoList().getTasks().get(0);
        String taskInProgress=board.getInProgressList().getTasks().get(0);
        String taskDone=board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("Java course module 11 tasks", taskToDo);
        Assert.assertEquals("Java course task 10.3", taskInProgress);
        Assert.assertEquals("Java course task 10.2", taskDone);
    }
}

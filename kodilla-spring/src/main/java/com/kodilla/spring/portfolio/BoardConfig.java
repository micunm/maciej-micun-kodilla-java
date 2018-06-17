package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    TaskList toDoList;

    @Qualifier("inProgress")
    TaskList inProgressList;

    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getTaskListTodo() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getTaskListInProgress() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getTaskListDone() {
        return new TaskList();
    }
}

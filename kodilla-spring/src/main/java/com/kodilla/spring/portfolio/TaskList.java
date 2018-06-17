package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
 //       this.tasks = tasks;
        tasks=new ArrayList<>();
    }

    public void addTaskToList(String taskString) {
        //       this.tasks = tasks;
        tasks.add(taskString);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks=new ArrayList<>();
    }

    public void addTaskToList(String taskString) {
        tasks.add(taskString);
    }

    public List<String> getTasks() {
        return tasks;
    }
}

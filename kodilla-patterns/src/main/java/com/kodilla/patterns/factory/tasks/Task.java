package com.kodilla.patterns.factory.tasks;

public interface Task {
    executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}

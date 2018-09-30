package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentsTasksQueue implements TaskObservable {
    private final List<TaskObserver> mentors;
    private final List<String> tasks;
    private final String studentsName;

    public StudentsTasksQueue (String studentsName) {
        mentors=new ArrayList<>();
        tasks=new ArrayList<>();
        this.studentsName=studentsName;
    }
    public void sendTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(TaskObserver taskObserver) {
        mentors.add(taskObserver);
    }
    @Override
    public void notifyObservers() {
        for(TaskObserver taskObserver : mentors) {
            taskObserver.update(this);
        }
    }
    @Override
    public void removeObserver (TaskObserver taskObserver) {
        mentors.remove(taskObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentsName() {
        return studentsName;
    }
}

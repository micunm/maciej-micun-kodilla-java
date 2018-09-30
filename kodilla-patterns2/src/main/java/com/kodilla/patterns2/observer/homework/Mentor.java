package com.kodilla.patterns2.observer.homework;


public class Mentor implements TaskObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }
    @Override
    public void update(StudentsTasksQueue studentsTasksQueue) {
        System.out.println(username + " new tasks to check: " + studentsTasksQueue.getStudentsName() +
                "\n task count: " + studentsTasksQueue.getTasks().size());
        updateCount++;
    }
    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}

package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping!", "watermelon", 3);
            case PAINTING:
                return new PaintingTask("Painting!", "white", "bedroom");
            case DRIVING:
                return new DrivingTask("Driving!", "Warsaw", "Car");
            default:
                return null;
        }

    }
}

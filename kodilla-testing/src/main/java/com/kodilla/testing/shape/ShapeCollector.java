package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addFigure (Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure (Shape shape) {
        boolean result=false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
    return result;
    }

    public Shape getFigure (int n) {
    Shape figure=null;
    //    ForumPost thePost = null;
        if (n >= 0 && n < shapes.size()) {
            figure = shapes.get(n);
        }
            return figure;
    }

    public void showFigures () {
        for (Shape testFigures : shapes) {
            System.out.println(testFigures.toString());
        }
    }
}

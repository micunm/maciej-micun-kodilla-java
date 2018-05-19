package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
/*      Processor processor=new Processor();
        ExecuteSaySomething executeSaySomething=new ExecuteSaySomething();
        Executor codeToExecute= () -> System.out.println("This is an example text");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text"));
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(20, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(5, 8, (a, b) -> a - b);
        expressionExecutor.executeExpression(17, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(25, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);*/

        // task 7.1
        PoemBeautifier beautifier=new PoemBeautifier();
        String testText="Tekst do testów.";

        beautifier.beautify("Jakiś tam tekst", (text) -> text.toUpperCase());
        beautifier.beautify("Jakiś tam tekst", (text) -> "ABC "+text+" ABC");
        beautifier.beautify("Jakiś tam tekst", (text) -> "******** "+text+" ********");
        beautifier.beautify("Jakiś tam tekst", (text) -> "_"+text.replace(" ", "_")+"_");
        beautifier.beautify("Jakiś tam tekst", (text) -> "@@@@@@@@ "+text+" @@@@@");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
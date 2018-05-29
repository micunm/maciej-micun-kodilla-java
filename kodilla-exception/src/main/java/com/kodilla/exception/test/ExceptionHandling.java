package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge challenge=new SecondChallenge();
        String resultText="";

        try {
            System.out.println("Second Challenge started.");
            resultText = challenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception x) {
            System.out.println("Exception occured (" + x +")\nOperation interrupted. Result text is empty");
        } finally {
            System.out.println("Result of the operation: ");
        }
        System.out.println(resultText);
    }
}

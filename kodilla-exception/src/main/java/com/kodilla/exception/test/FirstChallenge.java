package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        if(b == 0){
            throw (new ArithmeticException());
        }

        return a/b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result=0;

        try {
            System.out.println("Operation Division in progress...");
            result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception (" + ex +") - divider equals 0 \nOperation interrupted. Result set to 0.");
            result=0;
        } finally {
            System.out.println("Result of the operation: ");
        }
        System.out.println(result);

    }
}

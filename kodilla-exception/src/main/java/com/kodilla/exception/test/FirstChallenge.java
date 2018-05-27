package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        double result=0;

        try {
            if(b == 0){
                throw (new ArithmeticException());
            }
            result = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception (" + ex +") - divider equals 0 \n Result set to 0.");
        } finally {
            System.out.println("Result returned by the method: ");
        }
        return result;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}

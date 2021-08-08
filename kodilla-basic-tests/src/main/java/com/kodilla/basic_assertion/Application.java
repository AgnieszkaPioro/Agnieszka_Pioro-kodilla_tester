package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
            double a = 15.4;
            double b = 15.3;



            double sumResult = calculator.sum(a, b);
            boolean correct = ResultChecker.assertEquals(30.7, sumResult, 0.2);
            if (correct) {
                System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
            }
            else {
                System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
            }

            double subtractResult = calculator.subtract(a, b);
            boolean correctSubtract = ResultChecker.assertEquals(0.1, subtractResult, 0.2);
            if (correctSubtract) {
                System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
            }
            else {
                System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
            }

            double squaredResult = calculator.squared(a);
            boolean correctSquared = ResultChecker.assertEquals(237.16, squaredResult, 0.2);
            if (correctSquared) {
            System.out.println("Metoda squared działa poprawnie dla liczby " + a);
            }
            else {
            System.out.println("Metoda squared nie działa poprawnie dla liczby " + a);
            }
    }
}

package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 15.4;
        double b = 15.3;


        double sumResult = calculator.sum(a,b);
        assertEquals(30.7, sumResult, 0.2);

        double subtractResult = calculator.subtract(a, b);
        assertEquals(0.1, subtractResult, 0.2);

        double squareResult = calculator.squared(a);
        assertEquals(237.16, squareResult, 0.2);
    }
}

package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import com.kodilla.spring.basic.spring_dependency_injection.homework.Display;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void  shouldAddNumbers() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.add(100,50);
        Assertions.assertEquals(150,value);
    }
    @Test
    public void shouldSubtractNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.subtract(100,50);
        Assertions.assertEquals(50,value);
    }
    @Test
    public void shouldMultiplyNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.multiply(10, 5);
        Assertions.assertEquals(50, value);
    }
    @Test
    public void shouldDivideNumbers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double value = bean.divide(10, 5);
        Assertions.assertEquals(2, value);
    }
    @Test
    public void shouldDisplayValue() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean2 = context.getBean(Calculator.class);
        double sumValue = bean2.add(100,50);

        Display bean = context.getBean(Display.class);
        String value = bean.display(sumValue);
        Assertions.assertEquals("The value is[150.0]", value);
    }
}

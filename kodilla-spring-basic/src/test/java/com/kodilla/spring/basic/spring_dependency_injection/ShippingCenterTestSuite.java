package com.kodilla.spring.basic.spring_dependency_injection;

import com.kodilla.spring.basic.spring_dependency_injection.homework.Calculator;
import com.kodilla.spring.basic.spring_dependency_injection.homework.ShippingCenter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {
    @Test
    public void shouldSendPackage() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String value = bean.sendPackage("Ogrodowa 12", 15);
        Assertions.assertEquals("Package delivered to: Ogrodowa 12", value);
    }
    @Test
    public void shouldNotSendPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String value = bean.sendPackage("Ogrodowa 12", 50);
        Assertions.assertEquals("Package not delivered to: Ogrodowa 12", value);
    }
}

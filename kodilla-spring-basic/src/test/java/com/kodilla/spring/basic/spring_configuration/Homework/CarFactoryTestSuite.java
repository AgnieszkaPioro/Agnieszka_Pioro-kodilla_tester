package com.kodilla.spring.basic.spring_configuration.Homework;

import com.kodilla.spring.basic.spring_configuration.homework.Cabrio;
import com.kodilla.spring.basic.spring_configuration.homework.Car;
import com.kodilla.spring.basic.spring_configuration.homework.CarFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void shouldLightsTurnOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("createCabrio");
        //When
        boolean lights = cabrio.hasHeadlightsTurnedOn(LocalTime.of(5,0));
        //Then
        Assertions.assertFalse(lights);
    }
    @Test
    public void shouldCreateNewCabrio() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Cabrio cabrio = (Cabrio) context.getBean("createCabrio");
        //When
        String newCabrio = cabrio.getCarType();
        //Then
        Assertions.assertEquals("Cabrio", newCabrio);
    }
//        @Test
//        public void shouldCreateSeasonCar() {
//
//            //Given
//            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
//            CarFactory carFactory = context.getBean(CarFactory.class);
//            //When
//            Car newCar = carFactory.createNewCar("summer");
//            //Then
//            Assertions.assertEquals("Cabrio", newCar);
//    }
}

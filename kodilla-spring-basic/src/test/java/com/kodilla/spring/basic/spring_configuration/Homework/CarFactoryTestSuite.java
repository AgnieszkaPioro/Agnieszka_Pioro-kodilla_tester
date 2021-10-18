package com.kodilla.spring.basic.spring_configuration.Homework;

import com.kodilla.spring.basic.spring_configuration.homework.Cabrio;
import com.kodilla.spring.basic.spring_configuration.homework.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

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
        public void shouldCreateSeasonCar() {

            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Car car = (Car) context.getBean("createNewCar");
            //When
            String newCar = car.getCarType();
            System.out.println(newCar);
            //Then
            List<String> seasonCars = Arrays.asList("Cabrio", "Sedan", "SUV");
            Assertions.assertTrue(seasonCars.contains(newCar));
    }
}

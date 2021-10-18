package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    String choosenSeason;

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }
    @Bean
    public Sedan createSedan() {
        return new Sedan();
    }
    @Bean
    public SUV createSUV() {
        return new SUV();
    }
    @Bean
    public Car createNewCar() {

        Car car;

        if (choosenSeason == "summer") {
            car = new Cabrio();
//            System.out.println("A car was created " + car);
        }
        else if (choosenSeason == "spring") {
            car = new Sedan();
//            System.out.println("A car was created " + car);
        }
        else if (choosenSeason == "fall") {
            car = new Sedan();
//            System.out.println("A car was created " + car);
        }
        else
            car = new SUV();

        return car;
    }
}

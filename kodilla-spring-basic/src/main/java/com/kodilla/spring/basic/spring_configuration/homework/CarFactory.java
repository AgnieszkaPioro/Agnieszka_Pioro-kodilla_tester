package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    @Bean
    public Cabrio createCabrio() {
        return new Cabrio();
    }

    public Sedan createSedan() {
        return new Sedan();
    }

    public SUV createSUV() {
        return new SUV();
    }

    public Car createNewCar(String season) {

        Car car;
        String choosenSeason = season;
        if (choosenSeason == "summer") {
            car = createCabrio();
            System.out.println("A car was created " + car);
        }
        else if (choosenSeason == "spring") {
            car = new Sedan();
            System.out.println("A car was created " + car);
        }
        else if (choosenSeason == "fall") {
            car = new Sedan();
            System.out.println("A car was created " + car);
        }
        else
            car = new SUV();
            System.out.println("A car was created " + createSUV());

        return createSUV();
    }
}

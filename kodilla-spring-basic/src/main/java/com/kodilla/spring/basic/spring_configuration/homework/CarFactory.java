package com.kodilla.spring.basic.spring_configuration.homework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

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
        LocalDate localDate = LocalDate.now();
        LocalDate localDateStartSummer = LocalDate.of(2021, 6, 22);
        LocalDate localDateStartFall = LocalDate.of(2021, 9, 23);
        LocalDate localDateStartWinter = LocalDate.of(2021, 12, 22);
        LocalDate localDateStartSpring = LocalDate.of(2021, 3, 21);


        if (localDate.isBefore(localDateStartFall) && localDate.isAfter(localDateStartSummer)) {
            car = new Cabrio();
//            System.out.println("A car was created " + car);
        } else if (localDate.isBefore(localDateStartSummer) && localDate.isAfter(localDateStartSpring)) {
            car = new Sedan();
//            System.out.println("A car was created " + car);
        } else if (localDate.isBefore(localDateStartWinter) && localDate.isAfter(localDateStartFall)) {
            car = new Sedan();
//            System.out.println("A car was created " + car);
        } else {
            car = new SUV();
        }

        return car;
    }
}

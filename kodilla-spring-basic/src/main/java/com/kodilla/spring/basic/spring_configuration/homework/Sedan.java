package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

public class Sedan implements Car {


    LocalTime time2 = LocalTime.of(20,0);
    LocalTime time3 = LocalTime.of(6,0);


    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {

        if (time.isAfter(time3) & time.isBefore(time2)) {
            System.out.println("Its not time to turn sedan lights on...");
            return true;
        }
        System.out.println("Sedan lights turn on");
        return false;
    }

    @Override
    public String getCarType() {

        return "Sedan";

    }
}
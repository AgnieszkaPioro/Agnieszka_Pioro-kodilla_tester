package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

public class SUV implements Car {

    LocalTime time2 = LocalTime.of(20,00);
    LocalTime time3 = LocalTime.of(06,00);


    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime time) {

        if (time.isAfter(time3) & time.isBefore(time2)) {
            System.out.println("Its not time to turn SUV lights on...");
            return true;
        }
        System.out.println("SUV lights turn on");
        return false;
    }

    @Override
    public String getCarType() {

        return "SUV";
    }

    @Override
    public String toString() {
        return "SUV{" +
                "time2=" + time2 +
                ", time3=" + time3 +
                '}';
    }
}


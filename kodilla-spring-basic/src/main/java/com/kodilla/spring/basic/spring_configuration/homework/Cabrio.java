package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Cabrio implements Car {


    LocalTime time2 = LocalTime.of(20,0);
    LocalTime time3 = LocalTime.of(6,0);


    @Override
    public boolean hasHeadlightsTurnedOn(String season, LocalTime time) {

        if (time.isAfter(time2) & time.isBefore(time3)) {
            System.out.println("Cabrio lights turn on");
            return true;
        }
        System.out.println("Its not time to turn lights on...");
        return false;
    }

    @Override
    public String getCarType(String season, LocalTime time) {

        return "Cabrio";
    }

    @Override
    public String toString() {
        return "Cabrio{" +
                "time2=" + time2 +
                ", time3=" + time3 +
                '}';
    }
}

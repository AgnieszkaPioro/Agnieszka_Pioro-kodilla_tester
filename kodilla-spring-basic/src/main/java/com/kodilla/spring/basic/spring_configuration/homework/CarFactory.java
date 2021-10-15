package com.kodilla.spring.basic.spring_configuration.homework;

import jdk.vm.ci.meta.LocalVariableTable;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import java.sql.Time;
import java.time.LocalTime;

public class CarFactory {

    public Cabrio createCabrio() {
        return new Cabrio();
    }

    public Car createNewCar(String season) {

        Car car;
        String choosenSeason = season;
        if (choosenSeason == "summer") {
            car = new Cabrio();
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
            System.out.println("A car was created " + car);

        return new SUV();
    }

//
//    public void createNewCar(String season, LocalTime time) {
//
//    }
//    public void
//    if (season == "summer") {
//        Cabrio cabrioAga = new Cabrio();
//        System.out.println("Choosing new car " + cabrioAga);
//        return "cabrioAga";
//    }
//    else if (season == "fall" || season == "spring") {
//
//    }

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.createNewCar("summer");
        Cabrio cabrio = new Cabrio();
        cabrio.hasHeadlightsTurnedOn("summer", LocalTime.of(21,00));

    }
}

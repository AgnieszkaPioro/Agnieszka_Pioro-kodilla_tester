package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lexus;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car model: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());
    }
    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Lexus)
            return "Lexus";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown car model";
        }
    }



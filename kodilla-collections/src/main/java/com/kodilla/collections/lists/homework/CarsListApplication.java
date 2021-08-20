package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Ford> cars = new ArrayList<>();
        Ford fordAga = new Ford(27);
        cars.add(fordAga);
        cars.add(new Ford(80));
        cars.add(new Ford(40));

        cars.remove(2);
        cars.remove(fordAga);

        System.out.println(cars.size());

        for (Car ford : cars) {
            CarUtils.describeCar(ford);     //wyświetl w pętli for-each zawartość kolekcji, używając przygotowanej wcześniej metody describeCar z klasy CarUtils

        }
    }
}

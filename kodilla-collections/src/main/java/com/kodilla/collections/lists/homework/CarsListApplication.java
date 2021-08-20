package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Lexus;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car fordAga = new Ford(29);
        Car lexusAga = new Lexus(80);
        Car opelAga = new Opel(40);
        cars.add(fordAga);
        cars.add(lexusAga);
        cars.add(opelAga);

        for (Car car : cars)  {
            CarUtils.describeCar(car);
        }

        cars.remove(2);
        cars.remove(fordAga);


        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}

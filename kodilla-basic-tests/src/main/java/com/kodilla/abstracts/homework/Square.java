package com.kodilla.abstracts.homework;

public class Square extends Shape{

    private int sideLength;


    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void calcArea() {
        System.out.println(sideLength * sideLength);

    }
    @Override
    public void calcCircumference() {
        System.out.println(sideLength * 4);

    }
}

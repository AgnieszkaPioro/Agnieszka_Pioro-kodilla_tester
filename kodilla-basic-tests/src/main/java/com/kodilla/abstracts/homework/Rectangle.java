package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideLength;
    private int secondSideLength;

    public Rectangle(int sideLength, int secondSideLength) {
        this.sideLength = sideLength;
        this.secondSideLength = secondSideLength;
    }

    @Override
    public void calcArea() {
        System.out.println(sideLength * secondSideLength);

    }

    @Override
    public void calcCircumference() {
        System.out.println(sideLength * 2 + secondSideLength * 2);

    }
}

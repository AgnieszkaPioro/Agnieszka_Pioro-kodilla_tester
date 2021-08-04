package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int sideLength;
    private int hight;


    public Triangle(int sideLength, int hight) {
        this.sideLength = sideLength;
        this.hight = hight;
    }

    @Override
    public void calcArea() {
        System.out.println(sideLength * 1/2 * hight);
    }

    @Override
    public void calcCircumference() {
        System.out.println(sideLength * 3);
    }
}

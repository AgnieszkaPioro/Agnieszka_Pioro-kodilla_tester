package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    static double PI =  3.1415927;
    private int r = 8;

    public Circle(int r) {
        this.r = r;
    }


    @Override
    public void calcArea() {
        System.out.println(PI * r * r);

    }

    @Override
    public void calcCircumference() {
        System.out.println(2 * PI * r);

    }
}

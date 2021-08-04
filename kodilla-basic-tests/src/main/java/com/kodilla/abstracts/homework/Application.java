package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape square = new Square(5);
        System.out.println("The area of the square is: ");
        square.calcArea();
        System.out.println("The circumference of the square is: ");
        square.calcCircumference();

        Triangle triangle = new Triangle(6, 10);
        System.out.println("The area of the equilateral triangle is: ");
        triangle.calcArea();
        System.out.println("The circumference of the equilateral triangle is: ");
        triangle.calcCircumference();

        Rectangle rectangle = new Rectangle(4,8);
        System.out.println("The area of the rectangle is: ");
        rectangle.calcArea();
        System.out.println("The circumference of the rectangle is: ");
        rectangle.calcCircumference();

        Shape circle = new Circle(8);
        System.out.println("The area of the circle is: ");
        circle.calcArea();
        System.out.println("The circumference of the circle is: ");
        circle.calcCircumference();
        }
    }


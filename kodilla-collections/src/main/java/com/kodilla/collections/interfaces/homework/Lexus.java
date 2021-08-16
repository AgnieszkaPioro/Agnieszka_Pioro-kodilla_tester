package com.kodilla.collections.interfaces.homework;

public class Lexus implements Car {

    private int speed;

    public Lexus(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 35;
        System.out.println("Lexus increased speed");

    }

    @Override
    public void decreaseSpeed() {
        this.speed += -15;
        System.out.println("Lexus decreased speed");

    }
}

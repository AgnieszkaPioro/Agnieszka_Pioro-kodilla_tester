package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 20;
        System.out.println("Ford increased speed");

    }

    @Override
    public void decreaseSpeed() {
        this.speed += -10;
        System.out.println("Ford decreased speed");

    }
}

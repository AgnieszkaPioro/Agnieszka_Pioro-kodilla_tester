package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += 15;
        System.out.println("Opel increased speed");

    }

    @Override
    public void decreaseSpeed() {
        this.speed += -10;
        System.out.println("Opel decreased speed");

    }
}

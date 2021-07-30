package com.kodilla.inheritance;

public class NewestOperatingSystem extends OperatingSystem {

    public NewestOperatingSystem(int year) {
        super(year);
    }
    public void turnOn() {
        System.out.println("The newest system is turning on...");
    }
    public void turnOff() {
        System.out.println("The newest system is turning off...");
    }
}

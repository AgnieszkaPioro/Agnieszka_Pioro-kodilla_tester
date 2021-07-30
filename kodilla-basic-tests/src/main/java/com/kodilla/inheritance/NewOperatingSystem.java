package com.kodilla.inheritance;

public class NewOperatingSystem extends OperatingSystem {

    public NewOperatingSystem(int year) {
        super (year);
    }
    public void turnOn() {
        System.out.println("New system is turning on...");
    }
    public void turnOff() {
        System.out.println("New system is turning off...");
    }

}

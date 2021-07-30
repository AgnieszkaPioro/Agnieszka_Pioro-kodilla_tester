package com.kodilla.inheritance;

public class OperatingSystem {

    int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("System is turning on...");
    }
    public void turnOff() {
        System.out.println("System is turning off...");
    }
    public void displayYearOfProduction() {
        System.out.println("The year of the production of this system is " + year);
    }
}

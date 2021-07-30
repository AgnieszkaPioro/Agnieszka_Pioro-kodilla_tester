package com.kodilla.inheritance;

public class Systems {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2010);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        operatingSystem.displayYearOfProduction();

        NewOperatingSystem newOperatingSystem = new NewOperatingSystem(2018);
        newOperatingSystem.turnOn();
        newOperatingSystem.turnOff();
        newOperatingSystem.displayYearOfProduction();


        NewestOperatingSystem newestOperatingSystem = new NewestOperatingSystem(2021);
        newestOperatingSystem.turnOn();
        newestOperatingSystem.turnOff();
        newestOperatingSystem.displayYearOfProduction();
    }
}

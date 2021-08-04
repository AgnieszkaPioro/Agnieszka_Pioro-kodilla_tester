package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {

        Person maciej = new Person("Maciej", 41, new Soldier());
        System.out.println(maciej.firstName + " " + maciej.age + " " + maciej.job.getresponsibilities());


        Person kamil = new Person("Kamil", 33, new Firefighter());
        System.out.println(kamil.firstName + " " + kamil.age + " " + kamil.job.getresponsibilities() );

    }
}

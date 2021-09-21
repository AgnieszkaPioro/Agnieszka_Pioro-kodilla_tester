package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class PersonSources {


    private static List<Person> persons = new ArrayList<>();

    public static List<Person> prepareListOfPersons() {

        Person person1 = new Person(1.65,65);

        persons.add(new Person(1.65,65));
        persons.add(new Person(1.85,85));
        persons.add(new Person(1.55,45));
        persons.add(new Person(1.95,75));
        persons.add(new Person(1.85,125));

        return persons;
    }
}

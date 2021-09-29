package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class PersonSources {

    static Stream<Arguments> providePersonForTestingBmi() {

        return Stream.of(
                Arguments.of(new Person(1.65,65), "Normal (healthy weight)"),
                Arguments.of(new Person(1.85,85), "Normal (healthy weight)"),
                Arguments.of(new Person(1.55,35), "Very severely underweight"),
                Arguments.of(new Person(1.95,105), "Overweight"),
                Arguments.of(new Person(1.85,200), "Obese Class V (Super Obese)")
        );
    }
}

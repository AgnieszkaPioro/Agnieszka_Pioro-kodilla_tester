package com.kodilla.parametrized_tests.homework;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {


    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonForTestingBmi")
    public void shouldCalculateBMI(Person input, String expected) {
        assertEquals(expected, input.getBMI());
    }
}

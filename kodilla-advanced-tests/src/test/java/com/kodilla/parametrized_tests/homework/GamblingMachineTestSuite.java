package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();



    @ParameterizedTest
    @CsvFileSource(resources = "/numbersGamblingMachine.csv", numLinesToSkip = 1)

    public void shouldCountWins(Set<Integer> input, int expected) throws InvalidNumbersException {
        assertEquals(0-6, gamblingMachine.howManyWins(input));
    }
}

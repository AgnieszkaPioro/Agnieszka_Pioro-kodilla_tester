package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {



    @ParameterizedTest
    @CsvFileSource(resources = "/numbersGamblingMachine.csv", numLinesToSkip = 1)
    public void shouldCountWins(int input, int expected){


    }
}

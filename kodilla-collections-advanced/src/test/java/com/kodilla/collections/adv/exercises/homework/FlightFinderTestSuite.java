package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //when

        List<Flight> result = FlightFinder.findFlightsFrom("london");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("london", "berlin"));
        expectedList.add(new Flight("london", "barcelona"));
        assertEquals(expectedList, result);
    }
    @Test
    public void  testFindArrival() {
        //when

        List<Flight> result = FlightFinder.findFlightsTo("monachium");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("cracow", "monachium"));
        expectedList.add(new Flight("barcelona", "monachium"));
        assertEquals(expectedList, result);
    }
}

package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;

import java.util.*;

public class FlightFinder {

    Map<String, List<Flight>> flightFinder = new HashMap<>();


    public static List<Flight> findFlightsFrom(String departure) { //wylot

        List<Flight> results = new ArrayList<>();
        List<Flight> flights = FlightRepository.getFlightsTable();
        for (Flight flight : flights) {
            if (flight.getDeparture().equals(departure)) {
                results.add(flight);
            }
        }
        return results;
    }


    public static List<Flight> findFlightsTo(String arrival) {     //przylot

        List<Flight> results = new ArrayList<>();
        List<Flight> flights = FlightRepository.getFlightsTable();
        for (Flight flight : flights) {
            if (flight.getArrival().equals(arrival)) {
                results.add(flight);
            }
        }
        return results;
    }

    public static void main(String[] args) {

        FlightRepository.getFlightsTable();
        System.out.println(FlightRepository.getFlightsTable());
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.findFlightsFrom("london"));

    }
}

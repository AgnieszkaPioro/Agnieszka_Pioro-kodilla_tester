package com.kodilla.collections.adv.exercises.homework;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class FlightRepository {


    public static List<Flight> getFlightsTable() {

        List<Flight> airport = new ArrayList<>();

        Flight flight1 = new Flight("london", "berlin");
        Flight flight2 = new Flight("london", "barcelona");
        Flight flight3 = new Flight("cracow", "monachium");

        airport.add(flight1);
        airport.add(flight2);
        airport.add(flight3);

        return airport;
    }
}


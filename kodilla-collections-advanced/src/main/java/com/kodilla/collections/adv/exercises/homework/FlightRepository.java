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
        Flight flight4 = new Flight("cracow", "berlin");
        Flight flight5 = new Flight("barcelona", "monachium");
        Flight flight6 = new Flight("cracow", "barcelona");
        Flight flight7 = new Flight("monachium", "london");
        Flight flight8 = new Flight("monachium", "barcelona");

        airport.add(flight1);
        airport.add(flight2);
        airport.add(flight3);
        airport.add(flight4);
        airport.add(flight5);
        airport.add(flight6);
        airport.add(flight7);
        airport.add(flight8);

        return airport;
    }
}


package com.kodilla.collections.sets.homework;


import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("quinnElizabeth", 15/15, true));
        stamps.add(new Stamp("royalFamily", 15/15, false));
        stamps.add(new Stamp("royalFamily", 18/12, true));
        stamps.add(new Stamp("quinnElizabeth", 15/15, true));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps);
        System.out.println(stamps);
    }
}

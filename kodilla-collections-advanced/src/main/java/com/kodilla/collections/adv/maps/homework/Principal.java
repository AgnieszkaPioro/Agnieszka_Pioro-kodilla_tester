package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String firstNme;
    private String lastName;

    public String getFirstNme() {
        return firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public Principal(String firstName, String lastName) {
        this.firstNme = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(firstNme, principal.firstNme) && Objects.equals(lastName, principal.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNme, lastName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + firstNme + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

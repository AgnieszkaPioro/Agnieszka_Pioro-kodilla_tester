package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {

    private String name;
    private String schoolName;

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Principal(String firstName, String schoolName) {
        this.name = firstName;
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return Objects.equals(name, principal.name) && Objects.equals(schoolName, principal.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "firstName='" + name + '\'' +
                ", lastName='" + schoolName + '\'' +
                '}';
    }
}

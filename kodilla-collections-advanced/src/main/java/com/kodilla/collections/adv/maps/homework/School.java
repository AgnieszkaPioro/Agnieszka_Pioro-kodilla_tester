package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {



    private List<Double> school = new ArrayList<>();

    public School(double... school) {
        for (double numberOfStudents : school)
            this.school.add(numberOfStudents);
    }
    public double getNumberOfAllStudents() {
        double sum = 0.0;
        for (double numberOfStudents : school)
            sum += numberOfStudents;
            return sum;
    }
    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}

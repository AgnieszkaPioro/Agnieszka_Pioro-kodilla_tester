package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> london = new HashMap<>();

        School albusSchool = new School(38.0, 27.0, 28.0);
        School doloresSchool = new School(29.0, 24.0, 30.0);
        School severusSchool = new School(30.0, 23.0, 25.0);

        Principal albus = new Principal("albus", "dumbledore");
        Principal dolores = new Principal("dolores", "umbridge");
        Principal severus = new Principal("severus", "snape");

        london.put(albusSchool, albus);
        london.put(doloresSchool, dolores);
        london.put(severusSchool, severus);


        for (Map.Entry<School, Principal> schoolEntry : london.entrySet())
            System.out.println(schoolEntry.getValue().getFirstNme() + " " +
                      schoolEntry.getValue().getLastName() + " " + ", number of all students: " +
                    schoolEntry.getKey().getNumberOfAllStudents());

    }
}

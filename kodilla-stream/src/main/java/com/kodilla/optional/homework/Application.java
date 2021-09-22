package com.kodilla.optional.homework;

import com.kodilla.stream.User;
import jdk.javadoc.doclet.Doclet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher teacherWojtek = new Teacher("Wojtek");
        Teacher teacherMichal = new Teacher("Michał");

        Student studentAdam = new Student("Adam", null);
        Student studentMarek = new Student("Marek", teacherWojtek);
        Student studentJakub = new Student("Jakub", null);
        Student studentPiotr = new Student("Piotr", teacherMichal);

        students.add(studentAdam);
        students.add(studentMarek);
        students.add(studentJakub);
        students.add(studentPiotr);


        for (Student student : students) {
            Teacher teacher1 = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>"));
            System.out.println("Student: " + student.getName() + "  Teacher " + teacher1.getName());
        }
    }
}


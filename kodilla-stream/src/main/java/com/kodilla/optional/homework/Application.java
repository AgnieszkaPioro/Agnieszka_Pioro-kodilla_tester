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



        Optional<Teacher> optionalStudent = Optional.ofNullable(new Teacher(""));
        Optional<Teacher> optionalStudent2 = Optional.ofNullable(teacherWojtek);
        Optional<Teacher> optionalStudent3 = Optional.ofNullable(new Teacher(""));
        Optional<Teacher> optionalStudent4 = Optional.ofNullable(teacherMichal);



        String name =
                optionalStudent.orElse(new Teacher("")).getName();
        String name2 =
                optionalStudent2.orElse(new Teacher("")).getName();
        String name3 =
                optionalStudent3.orElse(new Teacher("")).getName();
        String name4 =
                optionalStudent4.orElse(new Teacher("")).getName();

        System.out.println(studentAdam.name + " " + name);
        System.out.println(studentMarek.name + " " + name2);
        System.out.println(studentMarek.name + " " + name3);
        System.out.println(studentMarek.name + " " + name4);


        System.out.println("...............................");


        for (Student student : students)
            if (student.getTeacher() == null)
            System.out.println("Student: " + student.getName() + "  Teacher " + "<undefined>");
         else {
            System.out.println("Student: " + student.getName() + "  Teacher " + student.getTeacher().getName());
        }
    }
}


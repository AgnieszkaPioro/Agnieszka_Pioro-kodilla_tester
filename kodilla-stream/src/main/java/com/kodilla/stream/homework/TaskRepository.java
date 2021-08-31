package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    static List<Task> getTask() {

        List<Task> tasks = new ArrayList<>();

        LocalDate myDate = LocalDate.of(2021, 9, 30);
        LocalDate myDate2 = LocalDate.of(2021, 7,23);
        LocalDate currentDate = LocalDate.now();
        LocalDate currentDate2 = LocalDate.of(2021, 6,12);

        Task task1 = new Task("exercises", currentDate, myDate);    // nazwa zadania, data rozpoczęcia, dealine
        Task task2 = new Task("learningEnglish", currentDate2, myDate2);
        Task task3 = new Task("saveMoney", currentDate, myDate);

        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        return tasks;
    }
}

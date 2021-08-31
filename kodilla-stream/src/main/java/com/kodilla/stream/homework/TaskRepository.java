package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;

public class TaskRepository {

    static List<Task> getTask() {

        LocalDate myDate = LocalDate.of(2021, 9, 30);
        LocalDate currentDate = LocalDate.now();

        Task task1 = new Task("exercises", currentDate, myDate);
        Task task2 = new Task("learningEnglish", currentDate, myDate);
        Task task3 = new Task("saveMoney", currentDate, myDate);

        getTask().add(task1);
        getTask().add(task2);
        getTask().add(task3);

        return getTask();
    }
}

package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {

        List<LocalDate> listOfDeadlines = TaskRepository.getTask()
                .stream()
                .filter(i -> i.getDeadline().isAfter(LocalDate.of(2021, 8, 31)))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(listOfDeadlines);
    }

    public static LocalDate getDeadline(Task task) {
        return task.getDeadline();
    }
}



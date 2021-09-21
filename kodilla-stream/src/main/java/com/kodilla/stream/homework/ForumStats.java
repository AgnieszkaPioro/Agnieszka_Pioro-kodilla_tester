package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {

    public static void main(String[] args) {
        double averagePosts = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(n -> n.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averagePosts);

        double averagePosts2 = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(n -> n.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averagePosts2);
    }
}

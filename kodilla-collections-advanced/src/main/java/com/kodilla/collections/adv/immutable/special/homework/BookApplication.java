package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookApplication {

    public static void main(String[] args) {

        Book book1 = BookManager.createBook("Hobbit", "Tolkien");
        Book book2 = BookManager.createBook("To", "King");
        Book book3 = BookManager.createBook("To", "King");


        System.out.println(book1 == book2);
        System.out.println(book2 == book3);
        System.out.println(book1 == book3);
    }
}

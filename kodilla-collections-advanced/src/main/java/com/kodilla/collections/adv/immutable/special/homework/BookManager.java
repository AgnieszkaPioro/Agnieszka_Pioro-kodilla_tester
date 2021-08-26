package com.kodilla.collections.adv.immutable.special.homework;

public class BookManager {

    public static Book createBook(String title, String author) {

        Book book = new Book(title, author);
        return book;

    }

}

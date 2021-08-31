package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {

    private static Set<Book> books = new HashSet<>();


    public static Book createBook(String title, String author) {



        for (Book book : books) {       //Iteruj po kolekcji books i kolejne jej elementy wstawiaj do zmiennej o nazwie book, która jest typu Book
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                return book;
            }
        }
        Book book = new Book(title, author);
        books.add(book);

        System.out.println(books.size());
        return book;
    }
}

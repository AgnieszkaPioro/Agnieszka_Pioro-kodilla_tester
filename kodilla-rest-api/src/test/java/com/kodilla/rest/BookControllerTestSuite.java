package com.kodilla.rest;

import com.kodilla.rest.controller.BookController;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class BookControllerTestSuite {


    @Test
    public void shouldAddBookToList() {

        //Given
        BookDto bookDto = new BookDto("Harry Potter", "J.K.Rowling");
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookService.addBook(bookDto);

        //When
        List<BookDto> books = bookController.getBooks();
        int size = books.size();

        //Then
        Assertions.assertEquals(1, size);

    }
}

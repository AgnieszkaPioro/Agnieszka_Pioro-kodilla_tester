package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();

    Order fruits = new Order(55, LocalDate.of(2021, 8, 13), "agnieszka");
    Order vegetables = new Order(80, LocalDate.of(2021, 8, 20), "kasia");
    Order drinks = new Order(35, LocalDate.of(2021, 8, 23), "ania");
    Order books = new Order(35, LocalDate.of(2020, 8, 19), "ania");
    Order games = new Order(35, LocalDate.of(2018, 6, 19), "ania");
    Order flowers = new Order(35, LocalDate.of(2017, 11, 13), "ania");

    //given
    @BeforeEach
    public void initializeInvoice() {
        shop.addOrder(fruits);
        shop.addOrder(vegetables);
        shop.addOrder(drinks);
        shop.addOrder(books);
        shop.addOrder(games);
        shop.addOrder(flowers);
    }
    @Test
    public void shouldAddOrderToList() {

        //when
        int numberOfItems = shop.getSize();
        //then
        assertEquals(6, numberOfItems);
    }
}

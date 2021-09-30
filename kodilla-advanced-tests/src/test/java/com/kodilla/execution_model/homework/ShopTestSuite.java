package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;
import org.mockito.internal.matchers.Or;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    private static Shop shop = new Shop();

    private static Order fruits = new Order(55, LocalDate.of(2021, 8, 13), "agnieszka");
    private static Order vegetables = new Order(80, LocalDate.of(2019, 8, 20), "kasia");
    private static Order drinks = new Order(35, LocalDate.of(2012, 8, 23), "ania");
    private static Order books = new Order(32, LocalDate.of(2016, 8, 19), "ania");
    private static Order games = new Order(45, LocalDate.of(2019, 9, 30), "ania");
    private static Order flowers = new Order(38, LocalDate.of(2017, 11, 13), "ania");

    @Test
    public void shouldAddOrderToShop() {
        //when
        int numberOfItems = shop.getSize();
        //then
        assertEquals(6, numberOfItems);
    }

    @Test
    public void shouldShowOrdersFromLastTwoYears() {
        //given
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(fruits);
        expectedList.add(games);
        //when
        List<Order> ordersFromTwoYears = shop.getOrdersFromLastTwoYears();
        //then
        assertEquals(expectedList, ordersFromTwoYears);
    }

    @Test
    public void shouldShowOrderWithTheHighestPrice() {
        //when
        int maxNumber = shop.getOrderWithHighestPrice();
        //then
        assertEquals(80, maxNumber);
    }

    @Test
    public void shouldShowOrderWithTheLowestPrice() {
        //when
        int minNumber = shop.getOrderWithTheLowestPrice();
        //then
        assertEquals(32, minNumber);
    }

    @Test
    public void shouldCountNumberOfOrders() {
        //when
        int numberOfItems = shop.getSize();
        //then
        assertEquals(6, numberOfItems);
    }

    @Test
    public void shouldSumAllOrderPrices() {
        //when
        int sumOfPrices = shop.sumAllOrderPrices();
        //then
        assertEquals(285, sumOfPrices);
    }
    @Test
    public void shouldShowOrdersWithDefinedPrices() {
        //given
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(games);
        //when
        List<Order> newList = shop.showOrdersWithDefinedPrices(40,50);
        //then
        assertEquals(expectedList,newList);
    }
    @BeforeAll
    public static void initializeOrders() {
        shop.addOrder(fruits);
        shop.addOrder(vegetables);
        shop.addOrder(drinks);
        shop.addOrder(books);
        shop.addOrder(games);
        shop.addOrder(flowers);
    }
}

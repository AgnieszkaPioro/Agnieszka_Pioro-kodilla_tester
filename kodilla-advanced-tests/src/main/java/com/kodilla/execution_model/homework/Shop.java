package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Shop {

    public static List<Order> myOrders = new ArrayList<>();

    public static List<Order> getMyList() {
        return myOrders;
    }

    public void addOrder(Order order) {
        this.myOrders.add(order);
    }

    public List<Order> getOrdersFromDefinedDates(LocalDate startDate, LocalDate lastDate) {

        List<Order> newList = Shop.getMyList()
                .stream()
                .filter(u -> u.getDate().isAfter(startDate))
                .filter(u -> u.getDate().isBefore(lastDate))
                .collect(Collectors.toList());

        return newList;
    }

    public int getSize() {
        return this.myOrders.size();
    }

    public int getOrderWithHighestPrice() {

        int max = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .max()
                .getAsInt();

        return max;
    }
    public int getOrderWithTheLowestPrice() {

        int min = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .min()
                .getAsInt();

        return min;
    }
    public int sumAllOrderPrices() {

        int sum = Shop.getMyList()
                .stream()
                .map(u -> u.getPrice())
                .mapToInt(n -> n)
                .sum();

        return sum;

    }
    public List<Order> showOrdersWithDefinedPrices(int from, int to) {

        List<Order> newList = Shop.getMyList()
                .stream()
                .filter(u -> u.getPrice() > from)
                .filter(u -> u.getPrice() < to)
                .collect(Collectors.toList());
        System.out.println(newList);

        return newList;
    }
}

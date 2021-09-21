package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Item;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> myOrders = new ArrayList<>();

    public void addOrder(Order order) {
        this.myOrders.add(order);

    }
    public Order showOrders(Order order) {

        return null;
    }
    public int getSize() {

        return this.myOrders.size();
    }
}

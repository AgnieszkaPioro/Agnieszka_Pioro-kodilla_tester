package com.kodilla.stream.exception.homework;

import com.kodilla.stream.User;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {

       private List<Order> orderList = new ArrayList<>();


       public void addOrder(Order order) {
              this.orderList.add(order);
       }


       public Order getOrder(String number) throws OrderDoesntExistException {
              List<Order> myOrders = orderList
                      .stream()
                      .filter(u -> u.getNumber().equals(number))
                      .collect(Collectors.toList());

              if (myOrders.isEmpty()) {
              throw new OrderDoesntExistException();
              }
              return myOrders.get(0);
       }
}

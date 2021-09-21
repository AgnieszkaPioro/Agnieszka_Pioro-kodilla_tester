package com.kodilla.stream.exception.homework;

import com.kodilla.stream.User;

import javax.swing.*;
import java.util.*;

public class Warehouse {

       public static List<Order> orderList = new ArrayList<>();

       public static List<Order> getOrderList() {

              Warehouse fruits = new Warehouse();
              fruits.addOrder(new Order(12));
              Warehouse vegetables = new Warehouse();
              vegetables.addOrder(new Order(15));
              Warehouse juices = new Warehouse();
              juices.addOrder(new Order(18));

              return orderList;

       }

       public void addOrder(Order order) {
              this.orderList.add(order);
       }
       public Order getOrder(int number) throws OrderDoesntExistException {
                 Warehouse.getOrderList()
                       .stream()
                       .filter(u -> u.getNumber() == 19)
                       .forEach(un -> System.out.println(un));

                 throw new OrderDoesntExistException();

       }
       public static int getOrderNumber(Order order) {
              return order.getNumber();
       }


}

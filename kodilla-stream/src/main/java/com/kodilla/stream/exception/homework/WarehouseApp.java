package com.kodilla.stream.exception.homework;

import static com.kodilla.stream.exception.homework.Warehouse.orderList;

public class WarehouseApp {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();


        Warehouse order1 = new Warehouse();
        order1.addOrder(new Order(12));

        Warehouse order2 = new Warehouse();
        order2.addOrder(new Order(13));




    }
}

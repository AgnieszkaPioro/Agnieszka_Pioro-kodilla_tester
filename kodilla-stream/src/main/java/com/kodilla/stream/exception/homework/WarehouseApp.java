package com.kodilla.stream.exception.homework;

public class WarehouseApp {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();


        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("13"));
        warehouse.addOrder(new Order("17"));

        try {
            warehouse.getOrder("10");
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist");
        }
    }
}

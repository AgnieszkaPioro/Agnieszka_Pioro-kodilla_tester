package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Order {

    int price;
    LocalDate date;
    String login;

    public Order(int price, LocalDate date, String login) {
        this.price = price;
        this.date = date;
        this.login = login;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}

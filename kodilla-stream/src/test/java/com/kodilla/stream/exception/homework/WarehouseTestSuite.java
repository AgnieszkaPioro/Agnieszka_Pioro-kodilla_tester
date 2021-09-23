package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("25"));
        warehouse.addOrder(new Order("16"));
        warehouse.addOrder(new Order("43"));

        //when
        Order isOrderExist = warehouse.getOrder("16");

        //then
        assertEquals(new Order("16").getNumber(), isOrderExist.getNumber());
    }

    @Test
    public void testGetOrder_withException() {

        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("25"));
        warehouse.addOrder(new Order("16"));
        warehouse.addOrder(new Order("43"));
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("1"));
    }
}
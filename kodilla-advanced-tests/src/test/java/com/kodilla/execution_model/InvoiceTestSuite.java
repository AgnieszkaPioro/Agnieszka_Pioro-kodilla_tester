package com.kodilla.execution_model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();                // przeniesienie zmiennych z wnętrza metod testujących do zmiennych klasy

    Item item = new Item("ham", 23);
    Item item2 = new Item("cheese", 14);
    Item item3 = new Item("bread", 4);


    @Test

    public void shouldAddItemsToInvoice() {
        //when
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(3, numberOfItems);
    }
    @Test
    public void shouldShowRightNameAndPrice() {
        //when
        Item testItem = invoice.getItem(1);
        //then
        assertEquals("cheese", testItem.getName());
        assertEquals(14, testItem.getPrice());
    }
    @Test
    public void shouldShowNullItem() {
        //when
        Item nullItem = invoice.getItem(-1);
        //then
        assertNull(nullItem);
    }
    @Test
    public void shouldShowNullItemBigIndex() {
        //when
        Item nullItem = invoice.getItem(9);
        //then
        assertNull(nullItem);
    }
    @Test
    public void shouldCleanInvoice() {
        //when
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(item);
        invoice.addItem(item2);
        invoice.addItem(item3);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }
    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}

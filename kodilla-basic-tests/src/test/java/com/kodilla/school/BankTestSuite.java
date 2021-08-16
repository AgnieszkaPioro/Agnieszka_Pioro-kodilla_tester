package com.kodilla.school;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldShowBalance() {

        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2500);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine cashMachineGdansk = new CashMachine();
        cashMachineGdansk.addOrWithdrawMoney(5000);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow, cashMachineGdansk};

        assertEquals(8000, new Bank(cashMachines).getCashMachinesBalance());
    }
    @Test
    public void shouldShowNumberOfWithdraws() {

        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2500);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine cashMachineGdansk = new CashMachine();
        cashMachineGdansk.addOrWithdrawMoney(5000);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow, cashMachineGdansk}; //dodanie bankomatu do tablicy

        assertEquals(1, new Bank(cashMachines).getNumberOfWithdraw());
    }
    @Test
    public void shouldShowNumberOfAdds() {

        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2500);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine cashMachineGdansk = new CashMachine();
        cashMachineGdansk.addOrWithdrawMoney(5000);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow, cashMachineGdansk}; //dodanie bankomatu do tablicy

        assertEquals(3, new Bank(cashMachines).getNumberOfAdd());
    }
    @Test
    public void shouldShowAverageAdd() {
        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2000);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine cashMachineGdansk = new CashMachine();
        cashMachineGdansk.addOrWithdrawMoney(6000);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow, cashMachineGdansk}; //dodanie bankomatu do tablicy

        assertEquals(3000, new Bank(cashMachines).getAverageAdd());
    }
    @Test
    public void shouldShowAverageWithdraw() {
        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2000);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine cashMachineGdansk = new CashMachine();
        cashMachineGdansk.addOrWithdrawMoney(-800);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow, cashMachineGdansk}; //dodanie bankomatu do tablicy

        assertEquals(-650, new Bank(cashMachines).getAverageWithdraw());
    }
}




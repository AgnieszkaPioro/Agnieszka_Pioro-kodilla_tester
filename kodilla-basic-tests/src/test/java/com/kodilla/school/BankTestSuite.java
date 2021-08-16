package com.kodilla.school;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {



    @Test
    public void shouldShowNumberOfAdds() {

        CashMachine cashMachineKrakow = new CashMachine();  //wywołaj na nim kilka razy metodę dodającą transakcje.
        cashMachineKrakow.addOrWithdrawMoney(1000);
        cashMachineKrakow.addOrWithdrawMoney(2500);
        cashMachineKrakow.addOrWithdrawMoney(-500);

        CashMachine[] cashMachines = new CashMachine[] {cashMachineKrakow};


    }
    @Test
    public void shouldShowBalance() {

    }
}




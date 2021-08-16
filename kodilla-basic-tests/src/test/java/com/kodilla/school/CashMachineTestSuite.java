package com.kodilla.school;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {                // test sprawdza czy jest zero elementów w tablicy
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldSumTransactionFromCashMachine() {     // test sprawdza sume transakcji w bankomacie
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOrWithdrawMoney(500);
        cashMachine.addOrWithdrawMoney(450);
        cashMachine.addOrWithdrawMoney(-100);
        cashMachine.addOrWithdrawMoney(100);

        assertEquals(950, cashMachine.getBalance());
    }
    @Test
    public void shouldShowNumberOfAdds() {                      // test sprawdza sume wpłat do bankomatu
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOrWithdrawMoney(500);
        cashMachine.addOrWithdrawMoney(500);
        cashMachine.addOrWithdrawMoney(-400);

        assertEquals(2,cashMachine.getNumberTransactionsAddMoney());
    }
    @Test
    public void shouldShowNumberOfWithdraws() {                 //// test sprawdza sume wypłat z bankomatu
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOrWithdrawMoney(500);
        cashMachine.addOrWithdrawMoney(500);
        cashMachine.addOrWithdrawMoney(-400);

        assertEquals(1,cashMachine.getNumberTransactionsWithdrawMoney());
    }
    @Test
    public void shouldShowAverageValueOfAdds() {                // srednia wartość wpłaty
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOrWithdrawMoney(600);
        cashMachine.addOrWithdrawMoney(800);
        cashMachine.addOrWithdrawMoney(-400);

        assertEquals(700,cashMachine.getAverageValueOfAdds());
    }
    @Test
    public void shouldShowAverageValueOfWithdraws() {               // srednia wartość wypłaty
        CashMachine cashMachine = new CashMachine();
        cashMachine.addOrWithdrawMoney(600);
        cashMachine.addOrWithdrawMoney(800);
        cashMachine.addOrWithdrawMoney(-400);

        assertEquals(-400, cashMachine.getAverageValueOfWithdraw());
    }
}

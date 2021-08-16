package com.kodilla.bank.homework;

public class CashMachine {

    private int[] values;
    private int size;


    public CashMachine() {
        this.values = new int[0];
    }

    public void addOrWithdrawMoney(int value) {         // metoda dodająca transakcje
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }


    public int getNumberOfTransaction() {       //metoda obliczająca wielkość tablicy - ilość transakcji
        return this.values.length;
    }


    public int[] getValues() {
        return values;
    }
    public double getBalance() {                // metoda zwracająca saldo bankomatu
        double balance = 0;
        for (int i = 0; i < this.values.length; i++) {
            balance += this.values[i];
        }
        return balance;
    }
    public double getSumOfAdds() {                          // metoda zwracająca wartość wszystkich wpłat
        double sumOfAdds = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                sumOfAdds += this.values[i];
            }
        }
        return sumOfAdds;
    }
    public double getSumOfWithdraws() {                          // metoda zwracająca wartość wszystkich wypłat
        double sumOfWithdraws = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                sumOfWithdraws += this.values[i];
            }
        }
        return sumOfWithdraws;
    }
    public int getNumberTransactionsAddMoney() {          //// liczba trans związanych z wpłatą
        int resultNumberOfTransactionsAddMoney = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                resultNumberOfTransactionsAddMoney++;
            }
        }
        return resultNumberOfTransactionsAddMoney;
    }


    public int getNumberTransactionsWithdrawMoney() {                // liczba transakcji z wypłatą
        int resultNumberOfTransactionWithdrawMoney = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                resultNumberOfTransactionWithdrawMoney++;
            }
        }
        return resultNumberOfTransactionWithdrawMoney;
    }
    public double getAverageValueOfAdds() {                             // średnia wartość wpłaty
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] > 0) {
                sum += this.values[i];
            }
        }
        return sum/getNumberTransactionsAddMoney();
    }
    public double getAverageValueOfWithdraw() {                         // średnia wartość wypłaty
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] < 0) {
                sum += this.values[i];
            }
        }
        return sum/getNumberTransactionsWithdrawMoney();
    }
}
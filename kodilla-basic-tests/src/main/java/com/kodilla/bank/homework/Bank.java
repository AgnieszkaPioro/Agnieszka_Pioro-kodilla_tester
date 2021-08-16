package com.kodilla.bank.homework;

import com.kodilla.school.Grades;

public class Bank {

    private CashMachine[] cashMachines;

        private int size;

        public Bank(CashMachine[] cashMachines) {
            this.cashMachines = cashMachines;

        }

        public int getCashMachinesBalance () {           // sprawdzenie bilansu bankomatu
            int balance = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                balance += this.cashMachines[i].getBalance();
            }
            return balance;
        }

        public int getNumberOfWithdraw () {
            int result = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                result += this.cashMachines[i].getNumberTransactionsWithdrawMoney();
            }
            return result;

        }

        public int getNumberOfAdd () {
            int result = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                result += this.cashMachines[i].getNumberTransactionsAddMoney();
            }
            return result;
        }

        public double getAverageWithdraw () {
            double sum = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                sum += this.cashMachines[i].getSumOfWithdraws();
            }
            return sum/getNumberOfWithdraw();
        }

        public double getAverageAdd () {
            double sum = 0;
            for (int i = 0; i < this.cashMachines.length; i++) {
                sum += this.cashMachines[i].getSumOfAdds();
            }
            return sum/getNumberOfAdd();
        }

    }



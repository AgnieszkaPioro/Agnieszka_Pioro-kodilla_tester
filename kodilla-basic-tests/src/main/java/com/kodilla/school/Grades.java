package com.kodilla.school;

public class Grades {
    private int[] values;   //zdefiniowaliśmy tablicę z zerową liczbą elementów
    private int size;

    public Grades() {
        this.size = 0;
        this.values = new int[0];
    }
    public void add(int value) { // metoda dodająca ocenę do tablicy
        this.size++; // zwiększamy o 1 wielkość tablicy
        int[] newTab = new int[this.size]; //tworzymy nową tablicę  z nowym rozmiarem
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab; //przypisanie nowo utworzonej tablicy do tablicy przechowywanej w klasie
    }

    public int[] getValues() {
        return values;
    }
    public double getAverage() {                // metoda obliczająca średnią ocen
        if (this.values.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.values.length; i++) {
            sum += this.values[i];
        }
        return sum/this.values.length;
    }

}

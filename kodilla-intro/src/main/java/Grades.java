import java.io.*;
import java.util.*;
public class Grades {       // klasa grades
    private int[] grades; //tablica grades
    private int size; //zmienna, która będzie "monitorować" aktualną liczbę elementów w tablicy

    public Grades() {
        this.grades = new int[10];  //W konstruktorze dodaliśmy przypisanie nowej wartości do zmiennej przechowującej oceny.
        this.size = 0; //Zmienna size mówi nam, ile elementów aktualnie znajduje się w tablicy
    }
    public void add(int value) { //metoda add dodająca przekazaną w argumencie ocenę do tablicy
        if (this.size == 10) {
            return;                 // przerywa działanie jeśli rozmiar tablicy = 10
        }
        this.grades[this.size] = value;
        this.size++; // dodanie elementu do tablicy jeśli rozmiar mniejszy od 10

    }
    public void lastGrade() { //wyciąganie ostatniej dodanej oceny

        System.out.println("Ostatnia dodana ocena to " + grades[this.size - 1]);
        }
    public void averageGrades() { //obliczanie średniej arytmetycznej ocen w tablicy

        System.out.println("Zawartość tablicy to " + Arrays.toString(grades));
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        System.out.println("Suma ocen wynosi " + sum);
        double result = sum / this.size;
        System.out.println("Srednia wszystkich ocen wynosi " + result);
        }

    public static void main(String[] args) { //dodanie ocen do tablicy
        Grades grades1 = new Grades();
        grades1.add(3);
        grades1.add(5);
        grades1.add(4);
        grades1.add(5);
        grades1.add(5);
        grades1.add(3);
        grades1.add(1);
        grades1.add(3);
        grades1.add(3);
        grades1.add(6);

        grades1.lastGrade();

        grades1.averageGrades();
    }
}


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
    public int lastGrade() { //wyciąganie ostatniej dodanej oceny

        int lastGradeReturn = grades[this.size - 1];
        return lastGradeReturn;
    }
    public double averageGrades() { //obliczanie średniej arytmetycznej ocen w tablicy

        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        double result = sum / this.size;
        return result;
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

        System.out.println("Srednia ocen to " + grades1.averageGrades());
        System.out.println("Ostatnia dodana ocena to " + grades1.lastGrade());
    }
}


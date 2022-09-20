import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "kot";
        animals[1] = "pies";
        animals[2] = "krowa";
        animals[3] = "hipopotam";
        animals[4] = "kogut";
        animals[4] = "kogut5";

        String animal = animals[4];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}

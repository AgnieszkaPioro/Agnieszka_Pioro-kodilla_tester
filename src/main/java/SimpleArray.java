public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        animals[0] = "kot";
        animals[1] = "pies";
        animals[2] = "krowa";
        animals[3] = "hipopotam";
        animals[4] = "kogut";

        String animal = animals[3];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}

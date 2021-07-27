import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;
        while (sum < 5000) {
            int a = random.nextInt(31); // losowanie liczby z zakresu [0,30] do zmiennej a
            if (a > max) max = a;
            if (a < min) min = a;
            sum = sum + a;
        }

        System.out.println(sum);
        System.out.println("Największa wylosowana liczba to " + max);
        System.out.println("Najmniejsza wylosowana liczba to " + min); // pokazuje się taka sama liczba min i max ???
    }

}
// Wyciąganie najmniejszej i największej wylosowanej liczby
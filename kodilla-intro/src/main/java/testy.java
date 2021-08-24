import java.util.Random;

public class testy {
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 8, 13,19,23,40};

        int result = 0;

        for (int i = 0; i < 6; i++) {
            if (numbers[i] % 4 == 0) {

                result = result + numbers[i];
            }
            System.out.println(result);

        }
    }
}


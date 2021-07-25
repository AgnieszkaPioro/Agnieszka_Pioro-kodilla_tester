public class RandomNumbers {

    public int getCountOfRandomNumber(int 0) {
        RandomNumbers random = new RandomNumbers();
        int result = 0;
        int sum = 0;
        while (sum < 5000) {
            int temp = random.nextInt(31);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
// Wyciąganie najmniejszej i największej wylosowanej liczby
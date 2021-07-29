import java.util.Scanner;
public class Colors {
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of your color:");
            String letter = scanner.nextLine().trim().toUpperCase();
            switch (letter) {
                case "B": return "BLUE";
                case "O": return "ORANGE";
                case "R": return "RED";
                case "W": return "WHITE";
                default:
                    System.out.println("Wrong letter. Try again");
            }
        }
    }
    public static void main(String[] args) {
        Colors colors = new Colors();
        String result = colors.getUserColor();
        System.out.println("result: " + result);
    }
}

public class testReturn {
    private static String sayHello() {
        String text = "Hello from FirstClass!";

        return text;
    }
    public static void main(String[] args) {
        String example = sayHello();
        System.out.println(example);
    }
}

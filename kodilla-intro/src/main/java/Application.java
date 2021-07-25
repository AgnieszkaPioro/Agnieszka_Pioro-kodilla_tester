public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {

    this.name = name;
    this.age = age;
    this.height = height;
    }

    public void checkApplication() {
        if (age > 30 && height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
    public static void main(String[] args) {
        Application adam = new Application("Adam", 40.5,178);
        System.out.println(adam.name + " " + adam.age + " " + adam.height);
        adam.checkApplication();
    }
}
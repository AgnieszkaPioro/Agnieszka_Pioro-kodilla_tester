public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User user1 = new User("Adam", 25);
        User user2 = new User("Karol", 34);
        User user3 = new User("Ewa", 29);
        User user4 = new User("Magda", 18);
        User user5 = new User("Jakub", 15);

        User[] users = {user1, user2, user3, user4, user5};

        int result = 0;
        for (int i =0; i < users.length; i++) {
            result = result + users[i].age;
        }
        result = result / users.length;
        System.out.println("Srednia wieku to " + result + " lata");


        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result) {
                System.out.println("Osoba poniżej średniej wieku to " + users[i].name);
            }

        }
        int numberOfElements = users.length;
    }
}







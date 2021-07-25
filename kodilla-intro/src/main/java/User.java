public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { //getter
        return age;
    }


    public static void main(String[] args) {

        User user1 = new User("Adam", 25);
        User user2 = new User("Karol", 34);
        User user3 = new User("Ewa", 29);
        User user4 = new User("Magda", 18);

        User[] users = {user1, user2, user3, user4};

        // suma i średnia wieku z tablicy, jak brać wartość pola "wiek"

        int wiek1 = 25;
        int wiek2 = 34;
        int wiek3 = 29;
        int wiek4 = 18;
        int suma = wiek1 + wiek2 + wiek3 + wiek4;
        System.out.println(suma);

        int numberOfElements = users.length;
        System.out.println(numberOfElements);

        double sredniaWieku = suma / numberOfElements;
        System.out.println(sredniaWieku);
    }
}

// Wyświetlanie imion, których wiek jest poniżej średniej ???






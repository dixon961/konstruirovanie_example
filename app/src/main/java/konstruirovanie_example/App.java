package konstruirovanie_example;

public class App {

    public static void main(String[] args) {
        var doctor = new Doctor("1", "Ivan Ivanov");
        var user = new User("2", "Petr Talanov");
        System.out.println("Doctor: " + doctor.fullName());
        System.out.println("User: " + user.fullName());
    }
}

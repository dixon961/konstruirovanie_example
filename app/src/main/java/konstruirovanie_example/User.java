package konstruirovanie_example;

public class User {

    private final String id;

    private final String fullName;

    public User(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String id() {
        return id;
    }

    public String fullName() {
        return fullName;
    }
}

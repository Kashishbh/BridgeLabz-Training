package cab_booking_System;
public class User {

    private final int userId;
    private final String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

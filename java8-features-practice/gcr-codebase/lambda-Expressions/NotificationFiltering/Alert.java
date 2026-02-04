package NotificationFiltering;

public class Alert {
    private String message;
    private String type; // e.g., "MEDICATION", "APPOINTMENT", "EMERGENCY"

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() { return message; }
    public String getType() { return type; }
    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

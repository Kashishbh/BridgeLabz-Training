import java.util.ArrayList;
import java.util.List;
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
class Contact {
    private String name;
    private String phoneNum;
    public Contact(String name, String phoneNum) throws InvalidPhoneNumberException {
        this.name = name;
        setPhoneNumber(phoneNum);
    }
    private void setPhoneNumber(String phoneNum) throws InvalidPhoneNumberException {
        if (!phoneNum.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits.");
        }
        this.phoneNum = phoneNum;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNum;
    }
}
class ContactOrganizer {
    private List<Contact> contact= new ArrayList<>();

    public void addContact(String name, String phoneNum) throws InvalidPhoneNumberException {
        for (Contact c : contact) {
            if (c.getPhoneNumber().equals(phoneNum)) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contact.add(new Contact(name, phoneNum));
        System.out.println("Contact added.");
    }
    public void deleteContact(String phoneNumber) {
        contact.removeIf(c -> c.getPhoneNumber().equals(phoneNumber));
        System.out.println("Contact deleted if it existed.");
    }
    public void searchContact(String key) {
        for (Contact c : contact) {
            if (c.getName().equalsIgnoreCase(key) || c.getPhoneNumber().equals(key)) {
                System.out.println(c.getName() + " - " + c.getPhoneNumber());
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}
public class PhoneContactOrganizer{
    public static void main(String[] args) {
        ContactOrganizer organizer = new ContactOrganizer();
        try {
            organizer.addContact("Kashish", "9876543210");
            organizer.addContact("Kanchan", "912456780");
            organizer.addContact("Duplicate", "9876543210"); 
            organizer.addContact("Invalid", "12345");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
        organizer.searchContact("Kashish");
        organizer.deleteContact("9123456789");
        organizer.searchContact("Kanchan");
    }
}

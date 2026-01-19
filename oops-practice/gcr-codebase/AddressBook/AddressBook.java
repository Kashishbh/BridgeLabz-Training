//UC--2
package AddressBook;

import java.util.*;

public class AddressBook {

    private List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        // UC-7: Check for duplicate
        for (Contact existingContact : contacts) {
            if (existingContact.equals(contact)) {
                System.out.println("Duplicate contact! Cannot add.");
                return;
            }
        }

        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }


    public void displayContacts() {
        System.out.println("\n--- Address Book ---");
        for (Contact contact : contacts) {
            contact.displayContact();
            System.out.println();
        }
    }
    
//UC--3
    public void editContactByName(String firstName) {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.print("Enter New Address: ");
                contact.setAddress(scanner.nextLine());

                System.out.print("Enter New City: ");
                contact.setCity(scanner.nextLine());

                System.out.print("Enter New State: ");
                contact.setState(scanner.nextLine());

                System.out.print("Enter New Zip: ");
                contact.setZip(scanner.nextLine());

                System.out.print("Enter New Phone Number: ");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter New Email: ");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
//UC--4
    public void deleteContactByName(String firstName) {

        boolean found = false;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }
 // UC-8: Search contacts by State
    public void searchByState(String state) {
        boolean found = false;
        System.out.println("\nContacts in State: " + state);
        for (Contact contact : contacts) {
            if (contact.getState().equalsIgnoreCase(state)) {
                contact.displayContact();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in this state.");
        }
    }
 // UC-8: Search contacts by City
    public void searchByCity(String city) {
        boolean found = false;
        System.out.println("\nContacts in City: " + city);
        for (Contact contact : contacts) {
            if (contact.getCity().equalsIgnoreCase(city)) {
                contact.displayContact();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in this city.");
        }
    }

}

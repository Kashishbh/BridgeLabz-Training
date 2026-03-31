package AddressBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // UC-6: Map to store multiple AddressBooks
        Map<String, AddressBook> systemAddressBooks = new HashMap<>();

        while (true) {
            System.out.println("\n=== Address Book System Menu ===");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Open Existing Address Book");
            System.out.println("3. List All Address Books");
            System.out.println("4. Search Person by City/State (Across All Address Books)"); // UC-8
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Create new AddressBook
                    System.out.print("Enter new Address Book Name: ");
                    String newBookName = scanner.nextLine();

                    if (systemAddressBooks.containsKey(newBookName)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        systemAddressBooks.put(newBookName, new AddressBook());
                        System.out.println("Address Book '" + newBookName + "' created successfully.");
                    }
                    break;

                case 2:
                    // Open existing AddressBook
                    if (systemAddressBooks.isEmpty()) {
                        System.out.println("No Address Books available. Create one first.");
                        break;
                    }

                    System.out.println("Available Address Books: " + systemAddressBooks.keySet());
                    System.out.print("Enter Address Book Name to open: ");
                    String openBookName = scanner.nextLine();

                    if (systemAddressBooks.containsKey(openBookName)) {
                        AddressBook currentBook = systemAddressBooks.get(openBookName);

                        // ---------- Existing UC1–UC5 logic goes here ----------
                        boolean continueAdding = true; // UC-5: loop for multiple contacts

                        while (continueAdding) {
                            // UC1: Take Contact Details
                            System.out.print("Enter First Name: ");
                            String firstName = scanner.nextLine();

                            System.out.print("Enter Last Name: ");
                            String lastName = scanner.nextLine();

                            System.out.print("Enter Address: ");
                            String address = scanner.nextLine();

                            System.out.print("Enter City: ");
                            String city = scanner.nextLine();

                            System.out.print("Enter State: ");
                            String state = scanner.nextLine();

                            System.out.print("Enter Zip: ");
                            String zip = scanner.nextLine();

                            System.out.print("Enter Phone Number: ");
                            String phoneNumber = scanner.nextLine();

                            System.out.print("Enter Email: ");
                            String email = scanner.nextLine();

                            // UC2: Create Contact & Add to AddressBook
                            Contact contact = new Contact(
                                    firstName, lastName, address,
                                    city, state, zip,
                                    phoneNumber, email
                            );
                            currentBook.addContact(contact);

                            // UC-5: Ask if user wants to add another
                            System.out.print("Do you want to add another contact? (yes/no): ");
                            String choiceAdd = scanner.nextLine();
                            if (choiceAdd.equalsIgnoreCase("no")) {
                                continueAdding = false;
                            }
                        }

                        // Display All Contacts
                        System.out.println("\n===== All Contacts in Address Book =====");
                        currentBook.displayContacts();

                        // UC3: Edit Contact
                        System.out.print("\nEnter First Name to Edit: ");
                        String nameToEdit = scanner.nextLine();
                        currentBook.editContactByName(nameToEdit);

                        // UC4: Delete Contact
                        System.out.print("\nEnter First Name to Delete: ");
                        String nameToDelete = scanner.nextLine();
                        currentBook.deleteContactByName(nameToDelete);

                        // Display Final Contacts
                        System.out.println("\n===== Final Contacts in Address Book =====");
                        currentBook.displayContacts();

                    } else {
                        System.out.println("Address Book not found!");
                    }
                    break;

                case 3:
                    // List all Address Books
                    if (systemAddressBooks.isEmpty()) {
                        System.out.println("No Address Books available.");
                    } else {
                        System.out.println("Available Address Books: " + systemAddressBooks.keySet());
                    }
                    break;

                case 4: // UC-8: Search by City/State
                    if (systemAddressBooks.isEmpty()) {
                        System.out.println("No Address Books available.");
                        break;
                    }

                    System.out.print("Enter City or State to search: ");
                    String location = scanner.nextLine();
                    boolean foundAny = false;

                    for (Map.Entry<String, AddressBook> entry : systemAddressBooks.entrySet()) {
                        System.out.println("\n--- Searching in Address Book: " + entry.getKey() + " ---");
                        AddressBook book = entry.getValue();
                        book.searchByCity(location);
                        book.searchByState(location);
                        foundAny = true;
                    }

                    if (!foundAny) {
                        System.out.println("No contacts found in any Address Book for this location.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

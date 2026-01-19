// UC--1
package AddressBook;
public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phNum;
    private String email;
    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phNum = phoneNumber;
        this.email = email;
    }
//UC--3
 // Getter (needed to find contact)
    public String getFirstName() {
        return firstName;
    }
    
 // ===== Add these getters for UC-8 =====
    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phNum = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //UC--7
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact other = (Contact) obj;
        // Duplicate check based on firstName + lastName
        return firstName.equalsIgnoreCase(other.firstName) &&
               lastName.equalsIgnoreCase(other.lastName);
    }

    @Override
    public int hashCode() {
        // Must override hashCode whenever equals is overridden
        return (firstName + lastName).toLowerCase().hashCode();
    }


    
    public void displayContact() {
        System.out.println("Contact Details");
        System.out.println("Name    : " + firstName + " " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City    : " + city);
        System.out.println("State   : " + state);
        System.out.println("Zip     : " + zip);
        System.out.println("Phone   : " + phNum);
        System.out.println("Email   : " + email);
    }
}


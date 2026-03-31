package SensitiveDataTagging;

public class Main {
    public static void main(String[] args) {

        UserAccount user = new UserAccount("kamii", "mypassword123");
        Product product = new Product("Laptop", 80000);

        EncryptionProcessor.process(user);
        EncryptionProcessor.process(product);
    }
}

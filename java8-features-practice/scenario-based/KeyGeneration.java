package review;

import java.util.*;

class Validator {

 public static String validate(String str) {

     if (str.length() == 0)
         return "Invalid Input (empty string)";

     if (str.length() < 6)
         return "Invalid Input (length < 6)";

     if (str.contains(" "))
         return "Invalid Input (contains space)";

     if (str.matches(".*\\d.*"))
         return "Invalid Input (contains digits)";

     if (!str.matches("[a-zA-Z]+"))
         return "Invalid Input (contains special character)";

     return "VALID";
 }
}

//Key Generator Class
class KeyGenerator {

 public static String generateKey(String str) {

     // Step 1: lowercase
     str = str.toLowerCase();

     // Step 2: remove even ASCII characters
     StringBuilder filtered = new StringBuilder();
     for (char c : str.toCharArray()) {
         if (c % 2 != 0)
             filtered.append(c);
     }

     // Step 3: reverse
     filtered.reverse();

     // Step 4: uppercase at even index
     StringBuilder result = new StringBuilder();
     for (int i = 0; i < filtered.length(); i++) {

         char c = filtered.charAt(i);

         if (i % 2 == 0)
             result.append(Character.toUpperCase(c));
         else
             result.append(c);
     }

     return result.toString();
 }
}

//Main Class
public class KeyGeneration {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < n; i++) {

         String input = sc.nextLine();

         String validation = Validator.validate(input);

         if (!validation.equals("VALID")) {
             System.out.println(validation);
         } else {

             String key = KeyGenerator.generateKey(input);
             System.out.println("The generated key is - " + key);
         }
     }

     sc.close();
 }
}
package review;

import java.util.*;

//Validator Class
class ShipmentValidator {

 static boolean isValidRecord(String record) {

     String[] parts = record.split("\\|");

     if (parts.length != 5) return false;

     String code = parts[0];
     String date = parts[1];
     String mode = parts[2];
     String weight = parts[3];
     String status = parts[4];

     return validCode(code) &&
            validDate(date) &&
            validMode(mode) &&
            validWeight(weight) &&
            validStatus(status);
 }

 // Shipment Code Validation
 static boolean validCode(String code) {

     if (!code.matches("SHIP-[1-9][0-9]{5}"))
         return false;

     String digits = code.substring(5);

     int count = 1;
     for (int i = 1; i < digits.length(); i++) {

         if (digits.charAt(i) == digits.charAt(i-1)) {
             count++;
             if (count > 3) return false;
         } else {
             count = 1;
         }
     }
     return true;
 }

 // Date Validation
 static boolean validDate(String date) {

     if (!date.matches("20\\d{2}-\\d{2}-\\d{2}"))
         return false;

     String[] d = date.split("-");
     int year = Integer.parseInt(d[0]);
     int month = Integer.parseInt(d[1]);
     int day = Integer.parseInt(d[2]);

     if (month < 1 || month > 12) return false;

     int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

     if (isLeap(year)) days[1] = 29;

     if (day < 1 || day > days[month-1]) return false;

     return true;
 }

 static boolean isLeap(int year) {
     return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
 }

 // Mode Validation
 static boolean validMode(String mode) {

     String[] modes = {"AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"};

     for (String m : modes)
         if (m.equals(mode))
             return true;

     return false;
 }

 // Weight Validation
 static boolean validWeight(String weight) {

     if (!weight.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?"))
         return false;

     double w = Double.parseDouble(weight);

     return w >= 0 && w <= 999999.99;
 }

 // Delivery Status Validation
 static boolean validStatus(String status) {

     return status.equals("DELIVERED") ||
            status.equals("CANCELLED") ||
            status.equals("IN_TRANSIT");
 }
}

//Main Class
public class GlobalShipment {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();

     for (int i = 0; i < n; i++) {

         String record = sc.nextLine();

         if (ShipmentValidator.isValidRecord(record))
             System.out.println("COMPLIANT RECORD");
         else
             System.out.println("NON-COMPLIANT RECORD");
     }

     sc.close();
 }
}
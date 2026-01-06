import java.util.Scanner;
public class CafeteriaMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menuItems = {"Tea","Coffee","Sandwich","Burger","Pizza","Pasta","Noodles","Samosa","Juice", "Ice Cream"};
        displayMenu(menuItems);
        System.out.print("\nEnter item number: ");
        int index = sc.nextInt();
        String selectedItem= getItemByIndex(menuItems, index);
        if (selectedItem!= null) {
            System.out.println("You ordered:"+selectedItem);
        }
    }
    public static void displayMenu(String[] items) {
        System.out.println("Cafeteria Menu");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " : " + items[i]);
        }
    }
    public static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        } else {
            System.out.println("Invalid item.");
            return null;
        }
    }
}

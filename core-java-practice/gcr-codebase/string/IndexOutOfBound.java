import java.util.Scanner;
public class IndexOutOfBound {
    static void generate(String text) {
        System.out.println(text.charAt(100));
    }
    static void handle(String text) {
        try{
            System.out.println(text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
    }     
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.next();
        handle(text);
    }
}

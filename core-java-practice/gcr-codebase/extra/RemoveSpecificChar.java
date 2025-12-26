import java.util.Scanner;
class RemoveSpecificChar{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        System.out.print("Enter character to remove: ");
        char removeChar = scan.next().charAt(0);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != removeChar) {
                result += ch;
            }
        }
        System.out.println("Modified String: \""+result+"\"");
    }
}

import java.util.Scanner;
public class CharType {
    static String check(char ch) {
        if (ch>= 'A' && ch<= 'Z')
            ch= (char)(ch+ 32);
        if (ch>='a' &&ch<= 'z') {
            if (ch== 'a'||ch=='e'||ch== 'i' ||
                ch == 'o'||ch== 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        System.out.println("Character\tType");
        for (int i= 0; i< text.length();i++)
            System.out.println(text.charAt(i)+"\t\t" +check(text.charAt(i)));
    }
}


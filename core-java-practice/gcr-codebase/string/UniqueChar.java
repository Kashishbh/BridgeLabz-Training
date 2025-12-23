import java.util.Scanner;
public class UniqueChar{
    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    static char[] findUniqueCharacters(String text) {
        int length= findLength(text);
        char[] temp= new char[length];
        int index= 0;
        for (int i= 0; i< length;i++) {
            char currentChar= text.charAt(i);
            boolean isUnique= true;
            for (int j= 0; j< i;j++) {
                if (currentChar== text.charAt(j)) {
                    isUnique= false;
                    break;
                }
            }
            if (isUnique) {
                temp[index]= currentChar;
                index++;
            }
        }
        char[] result = new char[index];
        for (int i= 0; i< index; i++) {
            result[i]= temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text= scan.nextLine();
        char[] uniqueChar= findUniqueCharacters(text);
        System.out.println("Unique characters are:");
        for (char ch : uniqueChar) {
            System.out.print(ch + " ");
        }
    }
}

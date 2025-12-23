import java.util.Scanner;
public class FrequencyUniqueChar{
    static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[index] = current;
                index++;
            }
        }
        char[] uniqueChars = new char[index];
        for (int i = 0; i < index; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }
    static String[][] findFrequency(String text) {
        int[] freq= new int[256]; // ASCII frequency array
        for (int i= 0; i< text.length();i++) {
            freq[text.charAt(i)]++;
        }
        char[] uniqueChar= uniqueCharacters(text);
        String[][] result= new String[uniqueChar.length][2];
        for (int i = 0; i< uniqueChar.length; i++) {
            result[i][0]= String.valueOf(uniqueChar[i]);
            result[i][1]= String.valueOf(freq[uniqueChar[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text= scan.nextLine();
        String[][] freq= findFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for (int i= 0; i< freq.length;i++) {
            System.out.println(freq[i][0]+"\t\t"+freq[i][1]);
        }
    }
}

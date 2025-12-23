import java.util.Scanner;
public class FrequencyOfChar {
    static Object[][] findFrequency(String text) {
        int[] freq= new int[256]; // ASCII frequency array
        for (int i= 0; i< text.length();i++) {
            char ch= text.charAt(i);
            freq[ch]++;
        }
        int uniqueCount= 0;
        for (int i= 0; i< text.length();i++) {
            if (freq[text.charAt(i)]!= 0) {
                uniqueCount++;
                freq[text.charAt(i)]= 0;
            }
        }
        for (int i= 0; i< text.length();i++) {
            char ch= text.charAt(i);
            freq[ch]++;
        }
        Object[][] result= new Object[uniqueCount][2];
        int ind= 0;  //ind is index 
        for (int i= 0; i < text.length(); i++) {
            char ch= text.charAt(i);
            if (freq[ch]!= 0) {
                result[ind][0]= ch;
                result[ind][1]= freq[ch];
                ind++;
                freq[ch] = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text= scan.nextLine();
        Object[][] frequency = findFrequency(text);
        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }
}

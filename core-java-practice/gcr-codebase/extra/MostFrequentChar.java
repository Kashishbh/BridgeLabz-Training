import java.util.Scanner;
class MostFrequentChar{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        int[] freq = new int[256];
        char mostFrequent= str.charAt(0);
        int maxCount= 0;
        for (int i= 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            freq[ch]++;
        }
        for (int i= 0; i< str.length();i++) {
            char ch= str.charAt(i);
            if (freq[ch]> maxCount) {
                maxCount= freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}

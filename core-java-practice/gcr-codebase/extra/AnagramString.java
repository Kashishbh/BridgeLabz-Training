import java.util.Scanner;
class AnagramString{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scan.nextLine();
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        if (s1.length() != s2.length()) {
            System.out.println("Strings are NOT anagrams");
            return;
        }
        int[] freq = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println("Strings are NOT anagrams");
                return;
            }
        }
        System.out.println("Strings are anagrams");
    }
}

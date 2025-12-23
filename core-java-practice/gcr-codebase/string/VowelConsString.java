import java.util.Scanner;
public class VowelConsString {
    static int[] count(String str) {
        int vow= 0, cons= 0;
        for (int i = 0; i < str.length(); i++) {
            char charecter = str.charAt(i);
            if (charecter>='A' &&charecter<='Z')
            	charecter=(char)(charecter+ 32);
            if (charecter>='a' &&charecter<= 'z') {
                if (charecter== 'a' || charecter== 'e' || charecter== 'i' ||
                		charecter== 'o' || charecter== 'u')
                    vow++;
                else
                    cons++;
            }
        }
        return new int[]{vow, cons};
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.nextLine();
        int[] result= count(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}

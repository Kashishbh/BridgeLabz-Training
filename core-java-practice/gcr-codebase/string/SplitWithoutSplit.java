import java.util.Scanner;
public class SplitWithoutSplit {
    static int findLen(String str) {
        int i= 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch(Exception e){}
        return i;
    }
    static String[] customSplit(String text) {
        int length= findLen(text);
        int count= 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                count++;
        }
        String[] words = new String[count];
        int start = 0, index = 0;
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word= "";
                for (int j= start; j< i;j++)
                    word+= text.charAt(j);
                words[index++]= word;
                start= i + 1;
            }
        }
        return words;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length!= b.length) return false;
        for (int i= 0; i< a.length;i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.nextLine();
        String[] custom= customSplit(text);
        String[] builtIn= text.split(" ");
        System.out.println("Are both results same? " + compareArrays(custom, builtIn));
    }
}

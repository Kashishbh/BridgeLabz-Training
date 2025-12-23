import java.util.Scanner;
public class SplitAndReturn{
    static int findLength(String str) {
        int i= 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (Exception e) {}
        return i;
    }
    static String[] customSplit(String text) {
        int length= findLength(text);
        int word= 1;

        for (int i = 0; i < length; i++)
            if (text.charAt(i) == ' ')
                word++;
        String[] arr = new String[word];
        int start = 0, ind = 0;

        for (int i= 0; i<= length; i++) {
            if (i==length|| text.charAt(i)== ' ') {
                String w="";
                for (int j= start; j<i;j++)
                    w+= text.charAt(j);
                arr[ind++]= w;
                start= i + 1;
            }
        }
        return arr;
    }
    static String[][] wordLenTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        String[] words = customSplit(text);
        String[][] result = wordLenTable(words);
        System.out.println("Word\tLength");
        for (int i=0; i<result.length; i++) {
            System.out.println(result[i][0]+ "\t"+ Integer.parseInt(result[i][1]));
        }
    }
}

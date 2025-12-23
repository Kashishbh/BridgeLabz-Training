import java.util.Scanner;
public class TraillingSpaces {
    static String customTrim(String str) {
        int start= 0, end= str.length() - 1;
        while (str.charAt(start)== ' ')
            start++;
        while (str.charAt(end) == ' ')
            end--;
        String result= "";
        for (int i= start; i<= end;i++)
            result+= str.charAt(i);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter text: ");
        String text= scan.nextLine();
        String custom= customTrim(text);
        String builtIn= text.trim();
        System.out.println("Matched: "+custom.equals(builtIn));
    }
}

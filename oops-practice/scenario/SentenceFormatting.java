import java.util.Scanner;
public class SentenceFormatting{
    public static String formatParagraph(String para) {
        if (para== null || para.trim().isEmpty()) {
            return "";
        }
        para= para.trim().replaceAll("\\s+", " ");
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < para.length(); i++) {
            char ch = para.charAt(i);
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
                while (i + 1 < para.length() && para.charAt(i + 1) == ' ') {
                    i++;
                }
                if (i + 1 < para.length()) {
                    result.append(" ");
                }
            }
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String inputPara= scan.nextLine();
        String formatPara = formatParagraph(inputPara);
        System.out.println("\nFormatted Paragraph:");
        System.out.println(formatPara);

    }
}


public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
    public static void main(String[] args) {

        String input = "Kashish Bhatnagar";
        int result = lengthOfLastWord(input);
        System.out.println("Input String: "+ input );
        System.out.println("Length of Last Word: "+ result);
    }
}

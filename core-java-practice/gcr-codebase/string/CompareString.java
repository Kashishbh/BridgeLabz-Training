import java.util.Scanner;
class CompareString {
	static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1= scan.nextLine();
        System.out.print("Enter second string: ");
        String str2= scan.nextLine();
        
        boolean charAtResult= compareUsingCharAt(str1, str2);
        boolean equalsResult= str1.equals(str2);
        System.out.println("Using charAt(): "+charAtResult);
        System.out.println("Using equals(): "+equalsResult); 
	}
}

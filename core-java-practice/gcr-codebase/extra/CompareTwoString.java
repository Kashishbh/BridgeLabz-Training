import java.util.Scanner;
class CompareTwoString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1= scan.nextLine();
        System.out.print("Enter second string: ");
        String s2= scan.nextLine();
        int minLength= s1.length() < s2.length() ? s1.length() : s2.length();
        boolean differenceFound = false;
        for (int i= 0; i< minLength;i++) {
            char c1= s1.charAt(i);
            char c2= s2.charAt(i);
            if (c1<c2) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                differenceFound = true;
                break;
            } else if (c1>c2) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                differenceFound= true;
                break;
            }
        }
        if (!differenceFound) {
            if (s1.length()< s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \""+s2+"\" in lexicographical order");
            } else if (s1.length() > s2.length()) {
                System.out.println("\"" + s2 + "\" comes before \""+s1+"\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}

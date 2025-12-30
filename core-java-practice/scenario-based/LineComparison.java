import java.util.Scanner;
class LineComparison {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to Line Comparison Program");
        //UC1
        // Calculate length of Line 1
        System.out.println("Enter coordinates of Line 1:");
        System.out.print("x1: ");
        int x1 = scan.nextInt();
        System.out.print("y1: ");
        int y1 = scan.nextInt();
        System.out.print("x2: ");
        int x2 = scan.nextInt();
        System.out.print("y2: ");
        int y2 = scan.nextInt();
        double len1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)
        );
        System.out.println("UC1: Length of Line 1 = "+len1);
        System.out.println("Enter coordinates of Line 2:");
        System.out.print("x3: ");
        int x3 = scan.nextInt();
        System.out.print("y3: ");
        int y3 = scan.nextInt();
        System.out.print("x4: ");
        int x4 = scan.nextInt();
        System.out.print("y4: ");
        int y4 = scan.nextInt();
        double len2 = Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3)
        );
        System.out.println("Length of Line 2 = "+ len2);
        //UC2 Check equality of two lines
        if (len1 == len2)
            System.out.println("UC2: Both lines are Equal");
        else
            System.out.println("UC2: Both lines are Not Equal");
        //UC3 Compare two lines
        if (len1 > len2)
            System.out.println("UC3: Line 1 is Greater than Line 2");
        else if (len1 < len2)
            System.out.println("UC3: Line 1 is Less than Line 2");
        else
            System.out.println("UC3: Both lines are Equal");
    }
}

import java.util.Scanner;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(Math.min(n1, n2), n3);
        int largest = Math.max(Math.max(n1, n2), n3);
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}


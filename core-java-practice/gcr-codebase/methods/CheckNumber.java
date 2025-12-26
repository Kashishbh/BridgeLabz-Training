import java.util.Scanner;
public class CheckNumber {
	public static void numberType(int n) {
		if (n > 0) {
			System.out.println("positive Number");
		} else if (n == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("Negative Number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		numberType(n);
	}

}

import java.util.*;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        List<String> output = fizzBuzz(n);

        System.out.println("FizzBuzz Output:");
        for (String s : output) {
            System.out.print(s + " ");
        }
    }
}

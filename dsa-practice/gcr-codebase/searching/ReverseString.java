import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a actual string: ");
        String str=scan.next();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Reverse string is: ");
        System.out.println(sb.reverse());
	}

}

import java.util.*;
public class ConcatenateStrings {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a length of the string array: ");
        int len=scan.nextInt();
        StringBuffer sf=new StringBuffer();
        String arr[]=new String[len];
        for(int i=0;i<len;i++) {
        	arr[i]=scan.next();
        	sf.append(arr[i]);
        	sf.append(" ");
        }
        System.out.println(sf);
        
	}

}

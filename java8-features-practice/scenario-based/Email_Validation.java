package review;
import java.util.*;
class Email{
	private static final String email_regex="^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$";
	public static Boolean validateEmail(String email) {
		return email.matches(email_regex);
	}
}
public class Email_Validation {
	public static  void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		StringBuilder sb=new StringBuilder();
		
		for (int i=0; i<n;i++) {
			String email=sc.nextLine();
			if(Email.validateEmail(email)) {
				sb.append("Access Granted\n");
				
			}
			else {
				sb.append("Access Denied\n");
			}
		}
		System.out.print(sb.toString());
		
	}

}

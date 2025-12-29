import java.util.*;
public class SandeepFitnessTracker{
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int pushup[]=new int[7];
        int count=0;
		System.out.println("enter pushup count of every day in the week");
        for(int i=0;i<pushup.length;i++) {
        	pushup[i]=scan.nextInt();
        	if(pushup[i]!=0) {
        		count+=pushup[i];
        	}
        	else {
        		continue;
        	}
        }
        double average=count/7.0;
        System.out.println("the total pushup in a week is "+count);
        System.out.println("the average pushup in a week is "+average);

	}

}

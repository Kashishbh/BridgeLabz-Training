import java.util.*;
public class CircularTour {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int gas[]=new int[n];
        int cost[]=new int[n];
        for(int i=0;i<n;i++) {
        	gas[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++) {
        	cost[i]=scan.nextInt();
        }
        System.out.println(circularTour(gas,cost));
	}
	public static int circularTour(int[] gas, int[] cost) {
        int totalGas = 0;   
       int tank = 0;       
       int start = 0;     

       for (int i = 0; i < gas.length; i++) {
           totalGas += gas[i] - cost[i];
           tank += gas[i] - cost[i];

           
           if (tank < 0) {
               start = i + 1;
               tank = 0;      
           }
       }

       
       return totalGas >= 0 ? start : -1;
   }
}

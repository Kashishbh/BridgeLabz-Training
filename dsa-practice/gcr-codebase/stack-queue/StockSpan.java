import java.util.*;
public class StockSpan {

	public static void main(String[] args) {
		int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = calculateSpan(prices);
        
        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Spans:        " + Arrays.toString(result));
	}
	public static int[] calculateSpan(int[] prices) {
        int n= prices.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        arr[0] = 1;
        st.push(0); 
        
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            
            
            if (st.isEmpty()) {
                arr[i] = i + 1;
            } else {
                arr[i] = i - st.peek();
            }
            
            st.push(i);
        }
        
        return arr;
    }
}

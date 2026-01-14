
import java.util.*;
public class SortTheStack {

	public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(2);
        sortStack(st);
        System.out.println("sorted stack: "+st);
	}
	public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();        
        sortStack(stack);          
        insert(stack, top); 
    }
	public static void insert(Stack<Integer> stack, int value) {
       
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        
        int top = stack.pop();
        insert(stack, value);

       
        stack.push(top);
    }
}

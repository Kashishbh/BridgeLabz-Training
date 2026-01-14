
import java.util.*;
public class ImplementQueueUsingStack {
    static Stack<Integer> st;
    static Stack<Integer> st1;
    static int size=0;
	public static void main(String[] args) {
		st = new Stack<>();
		st1 = new Stack<>();
        push(1);
        push(2);
        System.out.println(displaySize());
       System.out.println(pop());
        System.out.println(displaySize());
        push(3);
        push(4);
        System.out.println(peek());
        
	}
    public static void push(int element) {
    	st.push(element);
    	size++;
    }
    public static int pop() {
    	if(st.isEmpty()) {
    		System.out.println("queue is underflow");
    	}
    	else {
    		int initial_size=size;
    		while(initial_size>1) {
    			st1.push(st.pop());
    			initial_size--;
    		}
    		int num=st.pop();
            size--;
            return num;
    	}
    	return -1;
    }
    public static int peek() {
    	if(st.isEmpty()) {
    		System.out.println("queue is empty");
    	}
    	else {
    		while (!st.isEmpty()) {
                st1.push(st.pop());
            }
    		int val=st1.peek();
    		while(!st1.isEmpty()) {
    			st.push(st1.pop());
    		}
            return val;
    	}
    	return -1;
    }
    public static boolean empty() {
    	if(st.isEmpty()) {
    		return true;
    	}
    	return false;
    }
    public static int displaySize() {
    	return size;
    }
}

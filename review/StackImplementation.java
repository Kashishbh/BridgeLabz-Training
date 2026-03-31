class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push operation
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Print stack elements (Top to Bottom)
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(49);
        stack.push(66);
        stack.push(33);
        stack.push(73);

        stack.printStack();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        stack.printStack();

        System.out.println("Top element after pop: " + stack.peek());
    }
}

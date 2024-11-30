class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Function to add an element `x` to the stack
    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }

        // Insert element at the top of the stack
        arr[++top] = x;
        System.out.println("Inserted " + x);
    }

    // Function to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }

        // Decrease stack size by 1 and return the top element
        return arr[top--];
    }

    // Function to return the top element of the stack
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(1);
        }
        return -1;  // Unreachable code but necessary for compilation
    }

    // Function to return the size of the stack
    public int size() {
        return top + 1;
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display all elements in the stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements are:");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class stackImpmnt{
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        stack.pop();
        stack.pop();

        stack.display();

        System.out.println("Stack size after pop operations: " + stack.size());
    }
}

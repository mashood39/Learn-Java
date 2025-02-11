public class stackArray {
    public static void main(String[] args) {
        System.out.println("implementation of stack using array :-");

        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        
        st.display();
        
        System.out.println("\n" + st.peek());
        st.pop();

        st.display();
        System.out.println("\n" + st.peek());

        st.pop();

        st.display();

        System.out.println("\n" + st.peek());

    }
}

class stack{

    int[] stack = new int[5];
    int top = 0;

    void push(int data){
        stack[top] = data;
        top++;
    }

    void pop(){

        // int data;
        top--;
        // data = stack[top];

        System.out.println("\npopped element is " + stack[top]);
        stack[top] = 0;

    }

    int peek(){
        return stack[top - 1];
    }

    void display(){

        for(int n : stack){
            System.out.print(n + " ");
        }
    }

    
}

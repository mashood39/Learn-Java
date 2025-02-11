import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty());

        stack.push("apple");
        stack.push("mango");
        stack.push("orange");
        stack.push("grape");
        stack.push("banana");
        stack.push("jack fruit");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.search("grape"));

        System.out.println(stack.size());

        stack.forEach(n -> System.out.println(n) );

        System.out.println(stack.contains("mango"));

        // System.out.println(stack.hashCode());

        stack.clear();


        System.out.println(stack.size());

    }
}

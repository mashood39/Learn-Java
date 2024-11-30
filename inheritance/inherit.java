
public class inherit {
    public static void main(String[] args) {

        // animal a = new animal();

        dog dg = new dog();
        dg.bark();
        dg.eat();
    }
}

class animal {
    void eat() {
        System.out.println("animal eats food");
    }
}

class dog extends animal {
    void bark() {
        System.out.println("dog barks");
    }
}
public class inherit {
    public static void main(String[] args) {

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
        super.eat();
    }
}
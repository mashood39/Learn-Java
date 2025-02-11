package stuff;

class A {
    void msg() {
        System.out.println("parent class method");
    }

    void display(){
        System.out.println("dispaly the message");
    }
}

public class PrivateExample6 extends A {

    void msg() {
        System.out.println("child class method");

    }

    public static void main(String args[]) {
        PrivateExample6 obj = new PrivateExample6();
        obj.msg();
        obj.display();

    }
}
package this_keyword;

public class method {

    void display1(){
        System.out.println("dispaly 1 is working");
    }

    void display2(){
        System.out.println("dispaly 2 is working");
        this.display1();
    }
    public static void main(String[] args) {
        method m = new method();
        m.display2();
    }
}

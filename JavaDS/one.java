public class one {
    public static void main(String[] args) {
        two a = new two();
        a.displaytwo();
    }
}


class two{
    void displaytwo(){
        three b = new three();
        b.displaythree();
    }
}

class three{
    void displaythree(){
        four c = new four();
        c.displayfour();
    }

}

class four{
    void displayfour(){
        System.out.println("hello what is your name ");
    }
}

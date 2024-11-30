class student{
    int mark(int a , int b){
        System.out.println("two subjects");
        return a + b;
    }

    int mark(int a , int b , int c){
        System.out.println("three subjects");
        return a + b + c;
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.mark(10, 20));
        System.out.println(s.mark(10, 20, 30));
    }
}

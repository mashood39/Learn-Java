public class hello {
    public static void main(String[] args) {
        simple s1 = new simple();
        simple s2 = new simple();

        s1.a = 10;
        s1.b = 20;

        s2.a = 30;
        s2.b = 50;

        System.out.println(s1.a);
        System.out.println(s2.a);
        System.out.println(s1.b);
        System.out.println(s2.b);
    }
}

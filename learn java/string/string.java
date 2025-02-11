// package learn java.string;

public class string {
    public static void main(String[] args) {
        String a = "mashood";
        String b = "mashood";
        String c = new String("mashood");

        System.out.println(a == b);
        System.out.println(a == c);

        // System.out.println(a.equals("mashood"));

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}


public class instanceMethod {
    public static void main(String[] args) {
        System.out.println("mohamed mashood");

        instanceMethod im = new instanceMethod();
        int k = im.add(5,6);

        System.out.println(k);
        
        // System.out.println(add(10, 3));
    }

    int add(int a, int b){
        return a + b;
    }
}

package recursion;
public class fib {
    public static void main(String[] args) {
        System.out.println("Fibinocci number");
        System.out.println(fibo(3));

        System.out.println("Fibinocci series...");
        series(4);
    }

    static int fibo(int n){
        if (n < 2) return n;

        return fibo(n-1) + fibo(n - 2);

    }

    static void series(int n){
        // int ans = 
    }


}

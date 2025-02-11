public class digits {
    public static void main(String[] args) {
        // int n = 1321;
        // int sum = 0;

        // while (n > 0) {
        //     int digit = n % 10;
        //     sum = sum + digit;
        //     n = n / 10;
        // }

        // System.out.println(sum);

        System.out.println(sum(132));
    }

    public static int sum(int n){
        if(n < 9) return n;
        int digit = n % 10;
        n = n / 10;

        return digit + sum(n);
    }
}

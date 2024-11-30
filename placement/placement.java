public class placement {
    public static void main(String[] args) {

        // System.out.println( checkArmstrong(153) );

        nthFib(9);


    }

    public static void nthFib(int num){

        int a = 0;
        int b = 1;

        int next = 0;

        for(int i = 0; i < num - 2 ;i++){

            next = a + b;
            a = b;
            b = next;
        }

        System.out.println(next);
    }

    public static boolean checkArmstrong(int num){

        int x = num;
        double n = 0;

        while (x > 0) {
            int digit = x % 10;
            // n = n + digit * digit * digit;
            n = n + Math.pow(digit , 3);

            x = x / 10;
        }

        if(n == num) return true;
        else return false;
    }
}

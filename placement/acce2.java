
import java.util.Scanner;

public class acce2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        calculate(m , n);

        sc.close();


    }

    static void calculate(int m, int n){

        int sum = 0;
        for(int i = m;i < n;i++){
            if(i % 3 == 0 && i%5 == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}

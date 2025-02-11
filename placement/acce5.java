import java.util.Arrays;
import java.util.Scanner;

public class acce5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the sum");
        int sum = sc.nextInt();

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("enter the array elements");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(ProductSmallestPair(sum, arr, n));
        
        sc.close();
    }

    static int ProductSmallestPair(int sum, int[] arr, int n) {

        Arrays.sort(arr);

        if(arr.length < 2) return -1;

        if(arr[0] + arr[1] < sum){
            return arr[0] * arr[1];
        }
        else{
            return 0;
        }

    }
}

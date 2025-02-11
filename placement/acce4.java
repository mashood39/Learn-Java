import java.util.Scanner;

public class acce4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int arr[] = new int[length];

        for(int i = 0;i < length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the number");
        int num = sc.nextInt();

        System.out.println("enter the difference");
        int diff = sc.nextInt();

        System.out.println(findCount(arr, length, num, diff));
        sc.close();                     
    }

    static int  findCount(int[] arr, int length, int num, int diff){

        int count = 0;
        for(int i = 0;i < length;i++){
            if(Math.abs(arr[i] - num) <= diff){
                count++;
            }
        }

        return count > 0 ? count : -1;
    }
}

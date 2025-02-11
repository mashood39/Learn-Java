import java.util.Scanner;

public class acce6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(numberOfCarries(num1, num2));

        sc.close();
    }

    static int numberOfCarries(int num1, int num2){
        
        int carry = 0;
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        for(int i = str1.length() -1;i >= 0;i--){
            if(str1.charAt(i) + str2.charAt(i) > 9){
                carry++;
                System.out.println(str1.charAt(i) + str2.charAt(i));
            }
        }

        return carry;
    }
}

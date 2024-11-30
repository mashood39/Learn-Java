
import java.util.Scanner;

public class accenture {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        operationChoices(a, b, c);
        sc.close();
    }

    static void operationChoices(int a, int b, int c){

        if(c == 1){
            System.out.println(a + b);
        }

        else if(c == 2){
            System.out.println(a - b);
        }

        else if(c == 3){
            System.out.println(a * b);
        }

        else if(c == 4){
            System.out.println(a/b);
        }
    }
}

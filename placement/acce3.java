
import java.util.Scanner;

public class acce3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(OperationsBinaryString(str));
        sc.close();
    }

    static int OperationsBinaryString(String str){

        if(str == null) return -1;
        int res = str.charAt(0) - '0';
        // System.out.println(res);

        for(int i = 1;i < str.length();i++){
            if(str.charAt(i) == 'A'){
                res = res & (str.charAt(i+1) - '0');
            }

            else if(str.charAt(i) == 'B'){
                res = res | (str.charAt(i+1) - '0');
            }

            else if(str.charAt(i) == 'C'){
                res = res | (str.charAt(i+1) - '0');
            }
        }

        return res;
    }
}

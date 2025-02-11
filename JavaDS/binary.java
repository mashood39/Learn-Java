public class binary {
    public static void main(String[] args) {
        decimal2binary(2);
        binary2decimal(1111);
    }

    public static void decimal2binary(int num){

        int[] binary = new int[100];

        int i = 0;
        while(num > 0){
            binary[i] = num % 2;
            num = num/2;
            i++;
        }

        for(int j = i-1;j >= 0;j--){
            System.out.print(binary[j]);
        }


    }

    public static void binary2decimal(int num){
        
    }
}

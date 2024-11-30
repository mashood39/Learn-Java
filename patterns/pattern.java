public class pattern {
    public static void main(String[] args) {

        // pattern1(10);

        // patter2(10);

        // square(10);

        pattern3(10);
    }


    static void pattern3(int row){

        for(int i = 0;i < row ;i++){
            for(int j = )
        }
    }


    static void square(int x){

        for(int i = 1;i <= x;i++){
            for(int j = 1;j <= x;j++){

                if(j == 1 || j == x || i == 1 || i == x){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void patter2(int x){

        for(int i = 1; i < x;i++){
            for(int j = x ;j >= i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern1(int x){

        for(int i = 1;i < x;i++){
            for(int j = 0;j < i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

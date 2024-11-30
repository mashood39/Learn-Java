public class hcf {
    public static void main(String[] args) {
        System.out.println(getHcf(60, 75));
    }

    static int getHcf(int x , int y){

        int min = Math.min(x , y);

        for(int i = min;i >= 2;i--){
            if(x % i  == 0 && y % i == 0){
                return i;
            }
        }

        return 1;
    }
}

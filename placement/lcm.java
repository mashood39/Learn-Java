public class lcm {
    public static void main(String[] args) {
        System.out.println(getLcm(60,75));
    }

    static int getLcm(int x, int y){

        int lcm = (x > y) ? x : y;

        for(int i = lcm ; ;i++){
            if(i % x == 0 &&  i % y == 0){
                lcm = i;
                break;
            }
        }

        return lcm;


    }
}

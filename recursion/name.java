package recursion;

public class name {
    public static void main(String[] args) {
        names(5);
    }

    static void names(int count){
        if(count < 0) return ;

        else{
            System.out.println("mashood");
            count--;
            names(count);
        }
    }
}

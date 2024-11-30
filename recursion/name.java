
public class name {
    public static void main(String[] args) {
        int count = 5;
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

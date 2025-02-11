public class password {
    public static void main(String[] args) {
        
        String pwd = "21110141108";

        int i = 0;
        int j = pwd.length();

        while(i < j){
            char temp = pwd.charAt(i);
            pwd.charAt(i) = pwd.charAt(j);
            pwd.charAt(j) = temp;
        }
    }
}

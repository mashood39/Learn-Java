public class strToInt {
    public static void main(String[] args) {
        System.out.println("String to integer");

        String num = "124";

        int num2 = Integer.parseInt(num);

        System.out.println(num2 + 2);

        int num3 = Integer.valueOf(num);

        System.out.println(num3);
    }           
}

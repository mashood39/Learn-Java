
public class fibTriangle {
    public static void main(String[] args) {

        int rows = 5;

        int a = 0, b = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");

                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println();
        }
    }
}

public class set {
    public static void main(String[] args) {
        int ans = countSetBits(3);
        System.out.println(ans);
    }

    public static int countSetBits(int n) {
        // Write your code here
        int count = 0;

        for (int j = 1; j <= n; j++) {
            String str = Integer.toBinaryString(j);
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    count++;
                }
            }
        }

        return count;

    }
}


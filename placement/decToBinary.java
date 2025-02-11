public class decToBinary {
    public static void main(String[] args) {
        
        int decimal = 7;

        StringBuilder binary = new StringBuilder();

        while(decimal > 0 ){
            binary.insert(0 , decimal % 2);
            decimal = decimal / 2;
        }

        System.out.println(binary);

        // System.out.println(binary.toString() );
    }
}

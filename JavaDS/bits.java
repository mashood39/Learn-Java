public class bits {
    public static void main(String[] args) {
        // System.out.println("hello");
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        // getBit(n,pos,bitMask);
        setBit(n,pos,bitMask);

        
    }

    public static void setBit(int n, int pos, int bitMask){
        int num = bitMask | n;
        String str = Integer.toBinaryString(num);
        System.out.println(str);
        System.out.println(num);
    }

    public static void getBit(int n,int pos, int bitMask){
        if((bitMask & n) == 0){
            System.out.println(pos + "th position zero");
        }
        else{
            System.out.println("one");
        }
    }

    

}
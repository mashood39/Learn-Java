// package hashmap;
import java.util.Hashtable;

public class hash {
    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(1, "apple");
        ht.put(2, "mango");
        ht.put(3, "banana");
        ht.put(4, "orange");

    
        System.out.println(ht);
        System.out.println(ht.get(3));

        String a = ht.get(1);
        System.out.println(a);

        ht.remove(3);
        System.out.println(ht);

    }
}

package AugustSession;

import java.util.Hashtable;

public class Day5HashTable {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        
        Hashtable ht = new Hashtable();
        
        ht.put(0, "james");
        ht.put(1, "bond");
        ht.put(2, "secret");
        ht.put(3, "agent");
        
        System.out.println(ht.size()); // size
        System.out.println(ht.get(3)); // value at 3rd position
        
        Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        h1.put(1, 234);
        h1.put(2, 245);
        h1.put(3, 267);
        h1.put(4, 278);
        h1.put(5, 236);
        h1.clone();
        
        System.out.println(h1.get(0)); // at 0 position it will print NULL
        
        System.out.println(h1.clone()); //i guess it will clone/copy the
        
    }

}

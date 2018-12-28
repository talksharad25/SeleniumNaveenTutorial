package AugustSession;

import java.util.ArrayList;

public class Day5ArrayListandHashTable {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        
        al1.add(23);
        al1.add(34);
        al1.add(45);
        al1.add(56);
        al1.add(67);
        // print all ArrayList by using "for loop" 
        System.out.println(al1.get(3));
        System.out.println("the size of al is "+al1.size());
        for (int i=0; i<al1.size(); i++) {
            System.out.println(i +" "+ al1.get(i));
        }
        
        // ArrayList integer class wrap, contains only integer value
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        
        al2.add(123);
        al2.add(234);
        al2.add(345);
        al2.add(456);
        
        al2.remove(3);
        al2.add(2, 333); //update/replace the index and value 
       // System.out.println(al2.get(2));
        
       
        //string only arraylist
        ArrayList<String> als = new ArrayList<String>();
        
        als.add("james");
        als.add("bond");
        als.add("age 33");
        als.add("mi6");
        als.add("secret mission");
        
        System.out.println("The size is "+als.size());
       
        for(int i= 0; i<=al2.size(); i++) {
            System.out.println(i+" "+als.get(i));
        }
    }
}

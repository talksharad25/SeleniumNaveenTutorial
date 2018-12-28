package AugustSession;

public class Day4IncrementalDecr {

    public static void main(String[] args) {
        
        int i=1;
        int j=i++;    //post increment, assign the value first and than increase
        
        System.out.println(i); //2
        System.out.println(j); //1
        
        System.out.println("*****");
        
        int k=1;
        int l=++k;  //pre increment, increase the value first than assign to variable
        
        System.out.println(k); //2
        System.out.println(l); //2
        
    }
}

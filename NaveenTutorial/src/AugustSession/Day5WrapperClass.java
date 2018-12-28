package AugustSession;

public class Day5WrapperClass {

    public static void main(String[] args) {
     // wrapperclass convert string to integer = any data type
       
        // 1) String to integer
        String x = "100";
        System.out.println(x+432); // 100432
        
        // Integer.ParseInt will convert it to integer
        int i = Integer.parseInt(x);
        
        // if String (x=abc) + Integer = error: NumberFormatException
        System.out.println(i); 
        
        int a =200;
        System.out.println(i+a); // 300
        
        
        System.out.println("******");
        // 2) String to double
        String s1 = "12.44";
        
        System.out.println(s1+100);
        double d1 =Double.parseDouble(s1);
        
        System.out.println(100+d1);
        
        System.out.println("******");
        // 3) Integer to String
        
        int i2 = 100;
        
        String s2 = String.valueOf(i2);
        
        System.out.println(123+s2); //123100
        
        
    }

}

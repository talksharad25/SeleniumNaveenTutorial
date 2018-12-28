package AugustSession;

public class Day8StaticAndNonStaticMethod {
    /* 1. Static Method and static variable  & 
     * 2. NonStatic Method and non static variable
    Static 
    
    */
    // class variable - out of the main method 
    String name = "James"; //non static variable
    static int age = 25;   // static variable- no change in 25
    
    
    //main method-static
    public static void main(String[] args) {
     System.out.println("1.how to call STATIC STUFF");
     // 1.how to call STATIC STUFF
     // 1.1 direct calling: no need to create object
     getwheels();
     // 1.2 call by class name:
     Day8StaticAndNonStaticMethod.getwheels();
     
     // call static class variable 
        System.out.println(age); //age is static
        System.out.println(Day8StaticAndNonStaticMethod.age);
     
        System.out.println("2. how to call NON-STATIC STUFF");
     // 2. how to call NON-STATIC STUFF  
        // create an object
        
        Day8StaticAndNonStaticMethod sm = new Day8StaticAndNonStaticMethod();
        sm.sendmail();
        System.out.println(sm.name); //JAMES non static class variable
         
    }
    
    //1.1 static method
    public static void getwheels() {
        System.out.println("Get wheels");
        
    }
    
    //2.1 non-static method
    public void sendmail() {
        System.out.println("send mail");
        
    }
    
    
    
    
}

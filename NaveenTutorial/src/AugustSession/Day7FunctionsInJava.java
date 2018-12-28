package AugustSession;

public class Day7FunctionsInJava {

    public static void main(String[] args) {
        /* Method is also called function
         function are independent of each other
         Dead function: which does not take input and does not give output
         cannot create duplicate function, however by passing different parameter you can create
         create object to call other methods
        */
        
        Day7FunctionsInJava funt = new Day7FunctionsInJava();
        funt.test();
        funt.test(1); // test with parameter
        funt.getcity();
        funt.sum();
        // call getcity method 'c'
        String c = funt.getcity();
        System.out.println(c);
       
       // call sum method 'c'
       int s1= funt.sum();
       System.out.println(s1);
       
       //call statecity method
       String s2 = funt.StateCity("Guj", "Abad");
       System.out.println(s2);
       
        }
        
        // duplicate main method by paramater
        public static void main() {
        }
        
       //1. no input and no output:
       // void = does not return any value
        public void test() {
            System.out.println("test method");
        }
        
        //1. duplicate by parameter
        public void test(int a) {
            System.out.println("test method int a");
        }
        
        //2. no input but some output:
        
        public String getcity() {
            System.out.println("get city");
            String city = "Chicago";
            return city;
        }
        public int sum() {
            System.out.println("sum method"); 
            int a =20;
            int b=40;
            int c=a+b;
            
            return c;
        }
        
        //3. some input and some output
        public int div(int a, int b) {
            System.out.println("div method");
            int z=a/b;
            return z;
        }
       
        public String StateCity(String state, String city) {
            System.out.println("state and city");
            String sc = state+" "+city;
            return sc;
            
        }            
}

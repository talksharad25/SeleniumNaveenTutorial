package AugustSession;

public class Day3CondOpertorLoop {

    public static void main(String[] args) {
        
        // print 0 to 20 (even number) adding 2
        for(int a=0; a<=20; a=a+2) {
            System.out.println(a);
        }
        
        
        // print 10 to 1 (in reverse order) with help of 'for loop'
        // except 5
        
        for(int b=10; b>=0; b--) {
            if(b==5) {
                System.out.println("exception"); // except 5
            }else {
                System.out.println(b);
            }
        }
    }
    }

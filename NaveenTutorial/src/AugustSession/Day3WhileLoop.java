package AugustSession;

public class Day3WhileLoop {

    public static void main(String[] args) {
        int i=20;
        while(i>=10) {
            if(i==15) {
                System.out.println("its 15");
                i--;
            }else {
                System.out.println(i);
                 i--; 
            }
        }
    }
}

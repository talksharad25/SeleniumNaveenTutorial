package inheritanceDay9;

public class TestCar {

    public static void main(String[] args) {
        
        
        BMW bmw = new BMW();
        bmw.start(); //BMW start class will be called
        bmw.keyless();
        // stop class is not in BMW, it is called from Car class
        bmw.stop();
        
        // Top Casting
        Car c1 = new BMW();
        // child class object can be referred by parent class ref variable
        c1.start();
        c1.stop();
        c1.refuelling();
        // c1.keyless(); cannot be called as it is child class method
     
        // Down casting -- not possible, will give ClassCastException
        //BMW b1 = (BMW) new Car();
        
    }

}

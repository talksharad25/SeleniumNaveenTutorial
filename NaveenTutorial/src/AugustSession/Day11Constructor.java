package AugustSession;

public class Day11Constructor {

    String brand;
    int price;
    String engine;
    
    public Day11Constructor(String brand1, int price1, String engine1) {
        this.brand = brand1;
        this.price = price1;
        this.engine= engine1;
    }
    
    public static void main(String[] args) {

        Day11Constructor obj1 = new Day11Constructor("BMW", 125, "V6-auto");
        Day11Constructor obj2 = new Day11Constructor("Audi", 120, "V6-manual");
        Day11Constructor obj3 = new Day11Constructor("Hyd", 100, "V6-auto");
        
        System.out.println(obj1.brand + " "+obj1.price + " "+obj1.engine);
        System.out.println(obj2.brand + " "+obj2.price + " "+obj2.engine);
        System.out.println(obj3.brand + " "+obj3.price + " "+obj3.engine);
    }

}

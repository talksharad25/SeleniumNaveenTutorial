package InterfaceDay10;

public interface USBank {

    // in interface there cannot be method body declaration or business logic
    // only the prototype
    // no static methods in Interface
    // no main method
    // we cannot create OBJECT of Interface
    // but interface variable are static by default.
    
    public int min_bal = 100; // can create variables
    
    public void debit();
    
    public void credit();
    
    public void intltransf();
    
    
}

package InterfaceDay10;

public class HDFCBank implements USBank, RBIBank {
    
    // "implements" to use for inheriting interface to class
    // all the method of interface has to call
    // in interface there cannot be method body declaration or business logic
    // only the prototype
    // no static methods in Interface
    // no main method
    // we cannot create OBJECT of Interface
    // but interface variable are static by default.
    
    
    // US Bank
    public void credit() {
        System.out.println("USbank -- credit");
    }
    public void debit() {
        System.out.println("USbank -- debit");
    }
    public void intltransf() {
        System.out.println("USbank -- intltransf");
    }
    
    // RBI bank
    public void educationLoan(){
        System.out.println("RBI -- educ loan");
    }
    
    public void personalLoan() {
        System.out.println("RBI -- personal loan");
    }
    
    public void carLoan() {
        System.out.println("RBI -- car loan");
    }
    
    // HSBC can have own methods
    
    public void draft() {
        System.out.println("HSBC -- draft");
    }
    
}

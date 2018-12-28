package InterfaceDay10;

public class TestBank {

    public static void main(String[] args) {
        
        HDFCBank tb = new HDFCBank();
        tb.credit();
        tb.debit();
        tb.intltransf();
        
        tb.educationLoan();
        tb.personalLoan();
        tb.carLoan();
        
        tb.draft();
        
        System.out.println("Mim bal of US bank "+ USBank.min_bal);
        
        //child class object can be referred parent interface reference variable
        
        USBank ub = new HDFCBank();
        
        ub.credit();
        ub.debit();
        ub.intltransf();
        
        
        
        
        
    }

}

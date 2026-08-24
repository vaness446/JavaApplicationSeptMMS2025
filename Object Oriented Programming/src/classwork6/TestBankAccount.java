
package classwork6;

public class TestBankAccount {
    
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();
                
        acc1.deposit(500000);
        acc1.setAccountHolder("aga ben");
        acc1.setAccountNumber(99873221);
        acc1.withdraw(7000);
        acc1.displayDetails();
        
        
        
    
}
}

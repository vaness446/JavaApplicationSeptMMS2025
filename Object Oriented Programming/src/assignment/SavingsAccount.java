
package assignment;


public class SavingsAccount  extends BamkAccount{
    double interestRate = 0.04;

    public SavingsAccount(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }
    
        
    

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        
        System.out.println("amount withdrawn is :" + amount);
                
        System.out.println("========================");
        
    }
    

    @Override
    public void calculateIntrest() {
       double interest = balance*interestRate;
        System.out.println("intrest for savings acccount  is :"+interest);
        
                
        System.out.println("========================");
    }

   
}

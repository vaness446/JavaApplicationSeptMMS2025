
package assignment;


public class CurrentAccount extends BamkAccount {
    double interestRate = 0.01;

    public CurrentAccount(String accountHolder, int accountNumber, int balance) {
        super(accountHolder, accountNumber, balance);
    }
    
        
    

    @Override
    public void withdraw(double amount) {
        double overdraftLimit = 500;
        
        balance -= amount;
        System.out.println("amount withdrawn  is :"+amount);
                
        System.out.println("========================");
    }

    @Override
    public void calculateIntrest() {
         double interest = balance*interestRate;
        System.out.println("interest for savings account  is :" +interest);
                
        System.out.println("========================");
    }
}

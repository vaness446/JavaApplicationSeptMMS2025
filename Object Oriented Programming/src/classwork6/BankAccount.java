
package classwork6;


public class BankAccount {
   private  String accountHolder;
     private int accountNumber;
     private int balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    void deposit(double amount){
        balance += amount;
         System.out.println("this is the amount deposited is :"  + amount);
         
         
}



     void displayDetails(){
         System.out.println("Account holder  is :" + accountHolder);
         System.out.println("Account number  is :" + accountNumber);
         System.out.println("Account balance is :" + balance);
     }
     
public void withdraw(double amount) {
       
        
        balance -= amount;
        System.out.println("amount withdrawn  is :"+amount);
}
}
                
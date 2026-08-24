
package assignment;


 abstract public class BamkAccount {
     int accountNumber;
     String accountHolder;
     int balance;
     
     
     public BamkAccount(String accountHolder,int accountNumber,int balance){
         this.accountHolder = accountHolder;
         this.accountNumber = accountNumber;
         this.balance = balance;
         
         
     }

             

     void deposit(double amount){
        balance += amount;
         System.out.println("this is the amount deposited is :"  + amount);
         
                 
        System.out.println("========================");
  
     }
     
     void displayBalance(){
         System.out.println("Account holder  is :" + accountHolder);
         System.out.println("Account number  is :" + accountNumber);
         System.out.println("Account balance is :" + balance);
         
                 
        System.out.println("========================");
     }
    
     
     public abstract void withdraw(double amount);
     
     public abstract void  calculateIntrest();
     
     
     
}

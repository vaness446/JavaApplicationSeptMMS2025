
package assignment;

public class MainApp {
    public static void main(String[] args){
        BamkAccount acc1 = new SavingsAccount( "ada geogre", 111292929,1000);
                
        System.out.println("==========SavingsAccount==============");
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.calculateIntrest();
        acc1.displayBalance();
        
        
        
        System.out.println("========================");
        
        
        
        System.out.println("==========CURRENT ACCOUNT=============");
        
        BamkAccount acc2 = new CurrentAccount( "ada grace", 1567682223,2000);
        acc2.deposit(19990);
        acc2.withdraw(120);
        acc2.calculateIntrest();
        acc2.displayBalance();
        
    
    
 
    }
    
 
}

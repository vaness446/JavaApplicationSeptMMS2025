
package abstraction;


public class MainInterface {
    public static void main(String[] args){
        SmartPhone smartphone = new SmartPhone();
        
        Nokia3310 nokia = new Nokia3310();
        
        System.out.println("\nSmartPhone interface");
        smartphone.makeCall();
        smartphone.playGame();
        smartphone.playMusic();
        smartphone.playMovie();
        smartphone.connectToWifi();
                
                
        System.out.println("\n Nokia3310");
        nokia.makeCall();
        nokia.playGame();
        nokia.playMusic();
        
    }
}


package abstraction;


public class Nokia3310  implements Callable,Game,Music{

    @Override
    public void makeCall() {
        System.out.println("John is calling............");
    }
    @Override
    public void playGame() {
        System.out.println("The game is playing ............");
    }

    @Override
    public void playMusic() {
        System.out.println("Music is playing............");
       
    }
}

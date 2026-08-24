
package runtime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchedException {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
        System.out.printf("Enter your age: ");
        int age = input.nextInt();
        
        System.out.printf("your age is %d years old", age);
        }
        catch(InputMismatchException d){
            System.out.println("age is a number");
        }
        
    }
}

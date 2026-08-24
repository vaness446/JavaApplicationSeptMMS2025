
package chapter14;

 import java.util.Scanner;
public class ConvertingintValuestoCharacters {
  
public class Ex1415 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character code: ");
        int code = input.nextInt();
        System.out.println("Character: " + (char) code);
        System.out.println("\nCodes 000 to 255:");
        for (int i = 0; i <= 255; i++)
            System.out.printf("%03d = %c%n", i, (char) i);
    }
} 
}

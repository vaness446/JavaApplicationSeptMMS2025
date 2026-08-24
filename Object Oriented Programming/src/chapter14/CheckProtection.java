
package chapter14;

import java.util.Scanner;
public class CheckProtection {
    
public class Ex1420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dollar amount: ");
        String amount = input.nextLine();
        // Nine spaces are available.
        System.out.printf("%9s%n", amount).replace(' ', '*');
        String protectedAmount = String.format("%9s", amount)
                .replace(' ', '*');
        System.out.println(protectedAmount);
    }
}
}

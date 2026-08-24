
package chapter14;

import java.util.Scanner;
public class UppercaseandLowercase {
    
public class Ex1410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
}

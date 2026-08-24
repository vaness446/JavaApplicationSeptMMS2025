
package chapter14;

import java.util.Scanner;
public class ComparingStrings {
    
public class Ex143 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();
        int result = first.compareTo(second);
        if (result < 0)
            System.out.println("First string is less than second.");
        else if (result == 0)
            System.out.println("Strings are equal.");
        else
            System.out.println("First string is greater than second.");
    }
}
}

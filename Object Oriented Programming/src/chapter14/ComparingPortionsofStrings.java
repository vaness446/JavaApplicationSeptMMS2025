
package chapter14;

 import java.util.Scanner;
public class ComparingPortionsofStrings {
    
public class Ex144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = input.nextLine();
        System.out.print("Enter second string: ");
        String second = input.nextLine();
        System.out.print("Enter starting index in first string: ");
        int startFirst = input.nextInt();
        System.out.print("Enter starting index in second string: ");
        int startSecond = input.nextInt();
        System.out.print("Enter number of characters: ");
        int length = input.nextInt();
        boolean equal = first.regionMatches(
            true, startFirst, second, startSecond, length);
        System.out.println(equal ? "Strings are equal." :
                                   "Strings are not equal.");
    }
}
}

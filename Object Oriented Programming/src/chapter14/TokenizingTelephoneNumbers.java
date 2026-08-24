
package chapter14;

 import java.util.Scanner;
public class TokenizingTelephoneNumbers {
    
public class Ex148 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phone number (555) 555-5555: ");
        String phone = input.nextLine();
        String[] parts = phone.split("[() -]+");
        String areaCode = parts[0];
        String firstThree = parts[1];
        String lastFour = parts[2];
        String number = firstThree + lastFour;
        System.out.println("Area code: " + areaCode);
        System.out.println("Phone number: " + number);
    }
}
}

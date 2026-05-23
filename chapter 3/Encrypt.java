import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit integer: ");
        int number = scanner.nextInt();

        // Extract digits
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Step 1: Add 7 and mod 10
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;

        // Step 2: Swap d1 with d3, and d2 with d4
        int temp = d1; d1 = d3; d3 = temp;
        temp = d2; d2 = d4; d4 = temp;

        int encrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.printf("Encrypted number: %d%n", encrypted);
        scanner.close();
    }
}

Decryption Program:
import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encrypted 4-digit integer: ");
        int number = scanner.nextInt();

        // Extract digits
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;

        // Step 1: Reverse swap (d1 with d3, d2 with d4)
        int temp = d1; d1 = d3; d3 = temp;
        temp = d2; d2 = d4; d4 = temp;

        // Step 2: Reverse the +7 mod 10 (add 3 mod 10 = subtract 7 mod 10)
        d1 = (d1 + 3) % 10;
        d2 = (d2 + 3) % 10;
        d3 = (d3 + 3) % 10;
        d4 = (d4 + 3) % 10;

        int decrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
        System.out.printf("Decrypted number: %d%n", decrypted);
        scanner.close();
    }
}

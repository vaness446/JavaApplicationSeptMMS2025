import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        do {
            System.out.print("Enter 1 or 2: ");
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
        } while (choice != 1 && choice != 2);

        System.out.printf("You entered: %d%n", choice);
        scanner.close();
    }
}

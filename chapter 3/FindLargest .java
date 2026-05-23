import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.printf("%nThe largest number is: %d%n", largest);
        scanner.close();
    }
}

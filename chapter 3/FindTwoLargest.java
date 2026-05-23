import java.util.Scanner;

public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter integer %d: ", counter);
            int number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.printf("%nLargest: %d%n", largest);
        System.out.printf("Second Largest: %d%n", secondLargest);
        scanner.close();
    }
}

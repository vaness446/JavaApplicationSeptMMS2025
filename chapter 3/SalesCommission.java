import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSales = 0.0;

        System.out.print("Enter item value (0 to finish): ");
        double itemValue = scanner.nextDouble();

        while (itemValue != 0) {
            totalSales += itemValue;
            System.out.print("Enter item value (0 to finish): ");
            itemValue = scanner.nextDouble();
        }

        double earnings = 200.0 + 0.09 * totalSales;
        System.out.printf("%nTotal Sales: $%.2f%n", totalSales);
        System.out.printf("Weekly Earnings: $%.2f%n", earnings);

        scanner.close();
    }
}


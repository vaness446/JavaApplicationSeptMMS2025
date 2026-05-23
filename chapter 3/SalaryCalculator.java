import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int employee = 1; employee <= 3; employee++) {
            System.out.printf("--- Employee %d ---%n", employee);
            System.out.print("Enter hours worked: ");
            double hours = scanner.nextDouble();

            System.out.print("Enter hourly rate: $");
            double rate = scanner.nextDouble();

            double grossPay;
            if (hours <= 40) {
                grossPay = hours * rate;
            } else {
                grossPay = 40 * rate + (hours - 40) * rate * 1.5;
            }

            System.out.printf("Gross Pay: $%.2f%n%n", grossPay);
        }

        scanner.close();
    }
}

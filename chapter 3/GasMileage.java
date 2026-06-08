import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = scanner.nextInt();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = scanner.nextInt();

            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon this trip: %.2f%n", mpg);

            totalMiles += miles;
            totalGallons += gallons;
            tripCount++;

            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined MPG so far: %.2f%n%n", combinedMpg);

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = scanner.nextInt();
        }

        System.out.printf("%nTotal trips: %d%n", tripCount);
        if (totalGallons > 0) {
            System.out.printf("Overall MPG: %.2f%n",
                (double) totalMiles / totalGallons);
        }
        scanner.close();
    }
}


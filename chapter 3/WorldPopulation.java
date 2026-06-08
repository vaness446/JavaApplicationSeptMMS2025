public class WorldPopulation {
    public static void main(String[] args) {
        double currentPopulation = 8_100_000_000.0; // ~8.1 billion
        double growthRate = 0.009;                  // ~0.9% annual
        double doubleTarget = currentPopulation * 2;
        int doubleYear = -1;

        System.out.printf("%-8s%-22s%-20s%n",
            "Year", "Population", "Annual Increase");
        System.out.println("-".repeat(50));

        double prevPopulation = currentPopulation;

        for (int year = 1; year <= 75; year++) {
            double newPopulation = prevPopulation * (1 + growthRate);
            double increase = newPopulation - prevPopulation;

            System.out.printf("%-8d%-22.0f%-20.0f%n",
                year, newPopulation, increase);

            if (doubleYear == -1 && newPopulation >= doubleTarget) {
                doubleYear = year;
            }

            prevPopulation = newPopulation;
        }

        System.out.println("-".repeat(50));
        if (doubleYear != -1) {
            System.out.printf("%nPopulation doubles by Year %d.%n", doubleYear);
        } else {
            System.out.println("Population does not double within 75 years.");
        }
    }
}


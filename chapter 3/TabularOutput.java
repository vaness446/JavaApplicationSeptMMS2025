public class TabularOutput {
    public static void main(String[] args) {
        System.out.printf("%-5s%-10s%-10s%n", "N", "N^2", "N^3");
        System.out.println("-------------------------");

        for (int n = 1; n <= 10; n++) {
            System.out.printf("%-5d%-10d%-10d%n",
                n, n * n, n * n * n);
        }
    }
}

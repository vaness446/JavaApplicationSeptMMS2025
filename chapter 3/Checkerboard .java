public class Checkerboard {
    public static void main(String[] args) {
        // 8 rows
        for (int row = 0; row < 8; row++) {
            // 8 columns
            for (int col = 0; col < 8; col++) {
                // Alternate based on row+col parity
                if ((row + col) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();  // move to next row
        }
    }
}

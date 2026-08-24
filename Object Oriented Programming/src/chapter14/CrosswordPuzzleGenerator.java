
package chapter14;


public class CrosswordPuzzleGenerator {
    public class Ex1425 {
    public static void main(String[] args) {
        char[][] grid = new char[10][10];
        for (int row = 0; row < grid.length; row++)
            for (int col = 0; col < grid[row].length; col++)
                grid[row][col] = '#';
        // Example word placement:
        String word = "JAVA";
        for (int i = 0; i < word.length(); i++)
            grid[2][2 + i] = word.charAt(i);
        for (char[] row : grid) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }
}
}

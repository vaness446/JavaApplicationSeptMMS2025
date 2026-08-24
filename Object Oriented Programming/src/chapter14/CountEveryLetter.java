
package chapter14;

import java.util.Scanner;
public class CountEveryLetter {
    
public class Ex1412 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine().toLowerCase();
        int[] totals = new int[26];
        for (char c = 'a'; c <= 'z'; c++) {
            int position = text.indexOf(c);
            while (position != -1) {
                totals[c - 'a']++;
                position = text.indexOf(c, position + 1);
            }
        }
        System.out.println("Letter\tOccurrences");
        for (int i = 0; i < 26; i++)
            System.out.printf("%c\t%d%n", 'a' + i, totals[i]);
    }
}
}


package chapter14;

import java.util.Scanner;
public class ThreeLetterStringsFromaFiveLetterWord {
    
public class Ex1417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-letter word: ");
        String word = input.nextLine();
        if (word.length() != 5) {
            System.out.println("Word must contain exactly five letters.");
            return;
        }
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                for (int k = 0; k < 5; k++)
                    if (i != j && i != k && j != k)
                        System.out.println("" +
                            word.charAt(i) +
                            word.charAt(j) +
                            word.charAt(k));
    }
}
}

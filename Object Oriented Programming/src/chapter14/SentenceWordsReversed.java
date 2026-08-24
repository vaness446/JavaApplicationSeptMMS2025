
package chapter14;

import java.util.Scanner;
public class SentenceWordsReversed {
    
public class Ex149 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = input.nextLine();
        String[] words = line.split(" ");
        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
    }
}
}

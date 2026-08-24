
package chapter14;

import java.util.Scanner;
public class PigLatin {
    
public class Ex147 {
    static String printLatinWord(String word) {
        return word.substring(1) + word.charAt(0) + "ay";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(printLatinWord(word)).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
}

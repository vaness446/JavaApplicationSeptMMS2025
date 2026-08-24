
package chapter14;

import java.util.*;
public class SpellingChecker {
    
public class Ex1424 {
    static String[] wordList = {
        "default", "computer", "program", "java",
        "keyboard", "school", "student", "application"
    };
    static boolean contains(String word) {
        for (String w : wordList)
    }
            if (w.equalsIgnoreCase(word))
                return true;
        return false;
    static void suggestions(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char[] chars = word.toCharArray();
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
            String candidate = new String(chars);
            if (contains(candidate))
                System.out.println("Did you mean \"" + candidate + "\"?");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        if (contains(word))
            System.out.println("Word is spelled correctly.");
        else {
            System.out.println("Word is not spelled correctly.");
            suggestions(word);
        }
    }
}
}

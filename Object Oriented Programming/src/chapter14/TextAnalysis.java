
package chapter14;
import java.util.*;
public class TextAnalysis {
    
public class Ex1418 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        // a) Letter counts
        int[] letters = new int[26];
        for (char c : text.toLowerCase().toCharArray())
            if (c >= 'a' && c <= 'z')
                letters[c - 'a']++;
        System.out.println("\nLetter counts:");
        for (int i = 0; i < 26; i++)
            System.out.printf("%c: %d%n", 'a' + i, letters[i]);
        // b) Word-length counts
        String cleaned = text.replaceAll("[^A-Za-z' ]", "");
        String[] words = cleaned.trim().split("\\s+");
        int[] lengths = new int[cleaned.length() + 1];
        for (String word : words)
            if (!word.isEmpty())
                lengths[word.length()]++;
        System.out.println("\nWord-length counts:");
        for (int i = 1; i < lengths.length; i++)
            if (lengths[i] > 0)
                System.out.printf("%d: %d%n", i, lengths[i]);
        // c) Different word counts in order of first appearance
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        System.out.println("\nWord counts:");
        for (Map.Entry<String, Integer> entry : counts.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
}
}

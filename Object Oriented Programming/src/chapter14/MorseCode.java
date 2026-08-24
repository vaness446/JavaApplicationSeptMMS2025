
package chapter14;

 import java.util.*;
public class MorseCode {
   
public class Ex1422 {
    static String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.",
        "--.", "....", "..", ".---", "-.-", ".-..",
        "--", "-.", "---", ".--.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-",
        ".....", "-....", "--...", "---..", "----."
    };
    static String encode(String text) {
        StringBuilder result = new StringBuilder();
        for (String word : text.toUpperCase().split(" ")) {
            for (char c : word.toCharArray()) {
                if (c >= 'A' && c <= 'Z')
                    result.append(morse[c - 'A']).append(" ");
                else if (c >= '0' && c <= '9')
                    result.append(morse[26 + c - '0']).append(" ");
            }
            result.append("  ");
    }
        }
        return result.toString().trim();
    static String decode(String code) {
        StringBuilder result = new StringBuilder();
        for (String word : code.trim().split(" {3}")) {
            String[] letters = word.trim().split(" ");
            for (String letter : letters) {
                for (int i = 0; i < morse.length; i++) {
                    if (morse[i].equals(letter)) {
                        if (i < 26)
                            result.append((char)('A' + i));
                        else
                            result.append((char)('0' + i - 26));
                        break;
                    }
                }
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter English phrase: ");
        String phrase = input.nextLine();
        System.out.println(encode(phrase));
        System.out.print("Enter Morse phrase: ");
        String code = input.nextLine();
        System.out.println(decode(code));
    }
}
}

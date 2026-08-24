
package chapter14;

 import java.util.Scanner;
public class WordsBeginningWithb {
   
public class Ex1413 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        String[] words = text.split(" ");
        for (String word : words)
            if (word.toLowerCase().startsWith("b"))
                System.out.println(word);
    }
}
}

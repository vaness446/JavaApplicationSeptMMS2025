
package chapter14;

  import java.util.Scanner;
public class WordsEndingWithED {
  
public class Ex1414 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        String[] words = text.split(" ");
        for (String word : words)
            if (word.toUpperCase().endsWith("ED"))
                System.out.println(word);
    }
}
}

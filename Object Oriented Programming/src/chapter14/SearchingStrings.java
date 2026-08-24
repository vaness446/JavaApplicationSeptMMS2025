
package chapter14;

    import java.util.Scanner;

public class SearchingStrings {
    
public class Ex1411 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = input.nextLine();
        System.out.print("Enter search character: ");
        char ch = input.nextLine().charAt(0);
        int count = 0;
        int position = text.indexOf(ch);
        while (position != -1) {
            count++;
            position = text.indexOf(ch, position + 1);
        }
        System.out.println("Occurrences: " + count);
    }
}
}


package chapter14;

import java.util.Random;
public class RandomLimericks {
    
public class Ex146 {
    public static void main(String[] args) {
        String[] first = {"There once was a cat from the town",
                          "There once was a boy with a crown",
                          "There once was a dog who wore brown"};
        String[] second = {"Who smiled whenever he came around",
                           "Who danced whenever music was found",
                           "Who happily ran all around"};
        String[] third = {"He liked to play in the sun",
                          "It thought that running was fun",
                          "She jumped over a bun"};
        String[] fourth = {"And always had plenty of fun",
                           "Until the long day was done",
                           "Then rested when work was done"};
        String[] fifth = {"And never was seen wearing a frown.",
                          "And laughed when the day had begun.",
                          "And slept when the evening had begun."};
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println(first[r.nextInt(first.length)]);
            System.out.println(second[r.nextInt(second.length)]);
            System.out.println(third[r.nextInt(third.length)]);
            System.out.println(fourth[r.nextInt(fourth.length)]);
            System.out.println(fifth[r.nextInt(fifth.length)]);
            System.out.println();
        }
    }
}
}

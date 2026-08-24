
package chapter12;

   import java.awt.*;
import javax.swing.*;
public class GuesstheNumberGame {
    
public class Ex1214 extends JFrame {
    JTextField guessField;
    JLabel message, hint;
    JButton again;
    int number;
    int previousDistance = Integer.MAX_VALUE;
    public Ex1214() {
        message = new JLabel(
            "I have a number between 1 and 1000. Can you guess my number?"
        );
        hint = new JLabel("Please enter your first guess.");
        guessField = new JTextField(10);
        again = new JButton("Play Again");
        setLayout(new FlowLayout());
        add(message);
        add(hint);
        add(guessField);
        add(again);
        number = 1 + (int)(Math.random() * 1000);
        guessField.addActionListener(e -> checkGuess());
        again.addActionListener(e -> resetGame());
        setSize(600, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());
            if (guess == number) {
                hint.setText("Correct!");
                guessField.setEditable(false);
                return;
            }
            int distance = Math.abs(number - guess);
            if (distance < previousDistance)
                guessField.setBackground(Color.RED);
            else
                guessField.setBackground(Color.BLUE);
            previousDistance = distance;
            if (guess > number)
                hint.setText("Too High");
            else
                hint.setText("Too Low");
        } catch (NumberFormatException ex) {
            hint.setText("Enter an integer from 1 to 1000.");
        }
    }
    void resetGame() {
        number = 1 + (int)(Math.random() * 1000);
        previousDistance = Integer.MAX_VALUE;
        guessField.setText("");
        guessField.setEditable(true);
        guessField.setBackground(Color.WHITE);
        hint.setText("Please enter your first guess.");
    }
    public static void main(String[] args) {
        new Ex1214();
    }
}
}

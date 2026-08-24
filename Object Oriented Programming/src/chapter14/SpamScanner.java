
package chapter14;

import java.awt.*;
import javax.swing.*;
public class SpamScanner {
    
public class Ex1427 extends JFrame {
    JTextArea message;
    JLabel score;
    String[] spamWords = {
        "free", "winner", "win", "prize", "cash",
        "money", "offer", "click", "urgent", "congratulations",
        "buy now", "limited time", "bonus", "discount", "claim",
        "credit", "loan", "guaranteed", "million", "viagra",
        "investment", "risk free", "act now", "selected",
        "exclusive", "promotion", "deal", "earn money",
        "no obligation", "subscribe"
    };
    public Ex1427() {
        message = new JTextArea(15, 50);
        JButton scan = new JButton("Scan");
        score = new JLabel("Spam score: 0");
        scan.addActionListener(e -> scan());
        add(new JScrollPane(message), BorderLayout.CENTER);
        add(scan, BorderLayout.NORTH);
        add(score, BorderLayout.SOUTH);
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void scan() {
        String text = message.getText().toLowerCase();
        int points = 0;
        for (String word : spamWords) {
            int pos = text.indexOf(word);
            while (pos != -1) {
                points++;
                pos = text.indexOf(word, pos + 1);
            }
        }
        String rating;
        if (points >= 10)
            rating = "Very likely spam";
        else if (points >= 5)
            rating = "Likely spam";
        else if (points >= 2)
            rating = "Possibly spam";
        else
            rating = "Unlikely spam";
        score.setText(
            "Spam score: " + points + " — " + rating);
    }
}
    public static void main(String[] args) {
        new Ex1427();
    }
}

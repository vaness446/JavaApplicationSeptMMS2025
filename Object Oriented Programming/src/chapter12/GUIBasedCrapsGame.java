
package chapter12;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class GUIBasedCrapsGame {
     
    
public class Ex1216 extends JFrame {
    JTextField die1, die2, sum, point;
    JButton roll;
    Random random = new Random();
    int targetPoint = 0;
    boolean gameOver = false;
    public Ex1216() {
        die1 = new JTextField(5);
        die2 = new JTextField(5);
        sum = new JTextField(5);
        point = new JTextField(5);
        for (JTextField f : new JTextField[]{die1, die2, sum, point})
            f.setEditable(false);
        roll = new JButton("Roll Dice");
        roll.addActionListener(e -> play());
        setLayout(new FlowLayout());
        add(new JLabel("Die 1")); add(die1);
        add(new JLabel("Die 2")); add(die2);
        add(new JLabel("Sum")); add(sum);
        add(new JLabel("Point")); add(point);
        add(roll);
        setSize(450, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void play() {
        if (gameOver) return;
        int a = 1 + random.nextInt(6);
        int b = 1 + random.nextInt(6);
        int s = a + b;
        die1.setText(String.valueOf(a));
        die2.setText(String.valueOf(b));
        sum.setText(String.valueOf(s));
        if (targetPoint == 0) {
            if (s == 7 || s == 11) {
                JOptionPane.showMessageDialog(this, "You win!");
                gameOver = true;
            } else if (s == 2 || s == 3 || s == 12) {
                JOptionPane.showMessageDialog(this, "You lose!");
                gameOver = true;
            } else {
                targetPoint = s;
                point.setText(String.valueOf(targetPoint));
            }
        } else if (s == targetPoint) {
            JOptionPane.showMessageDialog(this, "You win!");
            gameOver = true;
        } else if (s == 7) {
            JOptionPane.showMessageDialog(this, "You lose!");
            gameOver = true;
        }
    }
    public static void main(String[] args) {
        new Ex1216();
    }
}
}

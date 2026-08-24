
package chapter12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TypingTutor {
    
public class Ex1220 extends JFrame {
    JTextArea typed;
    JButton[] keys;
    Color[] originalColors;
    String keyboard =
        "QWERTYUIOPASDFGHJKLZXCVBNM";
    public Ex1220() {
        typed = new JTextArea(5, 40);
        typed.setEditable(false);
        JPanel keyboardPanel = new JPanel(
            new GridLayout(3, 10, 3, 3));
        keys = new JButton[keyboard.length];
        originalColors = new Color[keyboard.length];
        for (int i = 0; i < keyboard.length; i++) {
            final int index = i;
            JButton key = new JButton(
                String.valueOf(keyboard.charAt(i)));
            keys[i] = key;
            originalColors[i] = key.getBackground();
            key.addActionListener(e ->
                typed.append(key.getText()));
            keyboardPanel.add(key);
        }
        add(new JScrollPane(typed), BorderLayout.NORTH);
        add(keyboardPanel, BorderLayout.CENTER);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char c = Character.toUpperCase(e.getKeyChar());
                for (int i = 0; i < keyboard.length(); i++) {
                    if (keyboard.charAt(i) == c)
                        keys[i].setBackground(Color.YELLOW);
                }
            }
            public void keyReleased(KeyEvent e) {
                for (int i = 0; i < keys.length; i++)
                    keys[i].setBackground(originalColors[i]);
            }
        });
        setFocusable(true);
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ex1220();
    }
}

}


package chapter12;
 import java.awt.*;
import javax.swing.*;
public class Ecofont {

    
public class Ex1219 extends JFrame {
    JTextArea text;
    int size = 9;
    public Ex1219() {
        text = new JTextArea();
        text.setFont(new Font("Verdana", Font.PLAIN, size));
        JButton increase = new JButton("Increase Font Size");
        JButton decrease = new JButton("Decrease Font Size");
        increase.addActionListener(e -> {
            size++;
            updateFont();
        });
        decrease.addActionListener(e -> {
            if (size > 1) size--;
            updateFont();
        });
        JPanel top = new JPanel();
        top.add(increase);
        top.add(decrease);
        add(top, BorderLayout.NORTH);
        add(new JScrollPane(text), BorderLayout.CENTER);
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void updateFont() {
        text.setFont(new Font("Verdana", Font.PLAIN, size));
    }
    public static void main(String[] args) {
        new Ex1219();
    }
}
}

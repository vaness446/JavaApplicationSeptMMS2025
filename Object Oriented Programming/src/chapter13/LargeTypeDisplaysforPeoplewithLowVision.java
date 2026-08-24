/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter13;

/**
 *
 * @author user
 */
 import java.awt.*;
import javax.swing.*;
public class LargeTypeDisplaysforPeoplewithLowVision {
   
public class Ex1332 extends JFrame {
    JTextArea textArea;
    JComboBox<String> fontBox;
    JCheckBox boldBox;
    int fontSize = 18;
public Ex1332() {
        super("Large-Type Display");
textArea = new JTextArea();
        textArea.setFont(new Font("Serif", Font.PLAIN, fontSize));
fontBox = new JComboBox<>(
                new String[]{"Serif", "SansSerif", "Monospaced"});
        boldBox = new JCheckBox("Bold");
JButton increase = new JButton("Increase Font Size");
        JButton decrease = new JButton("Decrease Font Size");
fontBox.setFont(new Font("SansSerif", Font.PLAIN, 20));
        boldBox.setFont(new Font("SansSerif", Font.PLAIN, 20));
        increase.setFont(new Font("SansSerif", Font.PLAIN, 20));
        decrease.setFont(new Font("SansSerif", Font.PLAIN, 20));
JPanel controls = new JPanel();
        controls.add(fontBox);
        controls.add(boldBox);
        controls.add(increase);
        controls.add(decrease);
add(controls, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
fontBox.addActionListener(e -> updateFont());
        boldBox.addActionListener(e -> updateFont());
increase.addActionListener(e -> {
            fontSize++;
            updateFont();
        });
decrease.addActionListener(e -> {
            if (fontSize > 1)
                fontSize--;
            updateFont();
        });
setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
void updateFont() {
        String name = (String) fontBox.getSelectedItem();
        int style = boldBox.isSelected() ? Font.BOLD : Font.PLAIN;
        textArea.setFont(new Font(name, style, fontSize));
    }
public static void main(String[] args) {
        new Ex1332();
    }

}
}

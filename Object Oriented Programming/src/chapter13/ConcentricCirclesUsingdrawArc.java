/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter13;

/**
 *
 * @author user
 */
 import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class ConcentricCirclesUsingdrawArc {
   
public class Ex136 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 50, y = 50, size = 280;
for (int i = 0; i < 8; i++) {
            g.drawArc(x, y, size, size, 0, 360);
            x += 10;
            y += 10;
            size -= 20;
        }
    }
public static void main(String[] args) {
        JFrame frame = new JFrame("13.6");
        frame.add(new Ex136());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
}

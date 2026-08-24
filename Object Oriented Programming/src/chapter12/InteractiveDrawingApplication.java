
package chapter12;


    import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InteractiveDrawingApplication {
    
public class DrawPanel extends JPanel {
    private MyShape[] shapes = new MyShape[100];
    private int shapeCount = 0;
    private int shapeType = 0;
    private MyShape currentShape;
    private Color currentColor = Color.BLACK;
    private boolean filledShape = false;
    private JLabel statusLabel;
    public DrawPanel(JLabel statusLabel) {
        this.statusLabel = statusLabel;
        setBackground(Color.WHITE);
        MouseHandler handler = new MouseHandler();
        addMouseListener(handler);
        addMouseMotionListener(handler);
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < shapeCount; i++)
            shapes[i].draw(g);
        if (currentShape != null)
            currentShape.draw(g);
    }
    public void setShapeType(int type) {
        shapeType = type;
    }
    public void setCurrentColor(Color color) {
        currentColor = color;
    }
    public void setFilledShape(boolean filled) {
        filledShape = filled;
    }
    public void clearLastShape() {
        if (shapeCount > 0)
            shapeCount--;
        repaint();
    }
    public void clearDrawing() {
        shapeCount = 0;
        repaint();
    }
    private class MouseHandler extends MouseAdapter
            implements MouseMotionListener {
        public void mousePressed(MouseEvent e) {
            // Create the appropriate MyShape from Exercise 10.2.
            // Initialize both points to e.getPoint().
        }
        public void mouseReleased(MouseEvent e) {
            if (currentShape != null) {
                // Set second point, store currentShape, and finish.
                currentShape = null;
                repaint();
            }
        }
        public void mouseMoved(MouseEvent e) {
            statusLabel.setText(
                String.format("Coordinates: (%d, %d)",
                    e.getX(), e.getY()));
        }
        public void mouseDragged(MouseEvent e) {
            if (currentShape != null) {
                // Update second point of currentShape.
                repaint();
            }
            statusLabel.setText(
                String.format("Coordinates: (%d, %d)",
                    e.getX(), e.getY()));
        }
    }
}
}

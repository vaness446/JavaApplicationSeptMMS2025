
package chapter14;

    
import java.awt.*;
import javax.swing.*;
public class CookingWithHealthierIngredients {

public class Ex1426 extends JFrame {
    JTextArea recipe;
    JTextArea result;
    public Ex1426() {
        recipe = new JTextArea(10, 40);
        result = new JTextArea(10, 40);
        result.setEditable(false);
        JButton check = new JButton("Suggest Substitutions");
        check.addActionListener(e -> suggest());
        add(new JScrollPane(recipe), BorderLayout.NORTH);
        add(new JScrollPane(result), BorderLayout.CENTER);
        add(check, BorderLayout.SOUTH);
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void suggest() {
        String text = recipe.getText();
        text = text.replaceAll("(?i)1 cup sour cream",
                "1 cup yogurt");
        text = text.replaceAll("(?i)1 cup sugar",
                "1/2 cup honey");
        text = text.replaceAll("(?i)1 cup butter",
                "1 cup margarine or yogurt");
        text = text.replaceAll("(?i)1 cup flour",
                "1 cup rye or rice flour");
        text = text.replaceAll("(?i)1 cup mayonnaise",
                "1 cup cottage cheese");
        text = text.replaceAll("(?i)1 egg",
                "2 egg whites");
        text = text.replaceAll("(?i)1 cup milk",
                "1 cup soy milk");
        text = text.replaceAll("(?i)1/4 cup oil",
                "1/4 cup applesauce");
        text = text.replaceAll("(?i)white bread",
                "whole-grain bread");
        result.setText(
            text + "\n\nAlways consult your physician before making " +
            "significant changes to your diet.");
    }
    public static void main(String[] args) {
        new Ex1426();
    }
}
}


package chapter12;

    import java.awt.*;
import javax.swing.*;
public class TemperatureConversion {
    
public class Ex1213 extends JFrame {
    JTextField input;
    JComboBox<String> from, to;
    JLabel result;
    public Ex1213() {
        input = new JTextField(8);
        from = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        to = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        JButton convert = new JButton("Convert");
        result = new JLabel("Result:");
        setLayout(new FlowLayout());
        add(input);
        add(from);
        add(new JLabel("to"));
        add(to);
        add(convert);
        add(result);
        convert.addActionListener(e -> convert());
        setSize(500, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    double toCelsius(double value, String unit) {
        if (unit.equals("Fahrenheit"))
            return 5.0 / 9.0 * (value - 32);
        if (unit.equals("Kelvin"))
            return value - 273.15;
        return value;
    }
    double fromCelsius(double c, String unit) {
        return 0;
    }
        if (unit.equals("Fahrenheit"))
            return 9.0 / 5.0 * c + 32;
        if (unit.equals("Kelvin"))
            return c + 273.15;
        return c;
    void convert() {
        try {
            double value = Double.parseDouble(input.getText());
            String fromUnit = (String) from.getSelectedItem();
            String toUnit = (String) to.getSelectedItem();
            double c = toCelsius(value, fromUnit);
            double answer = fromCelsius(c, toUnit);
            result.setText(String.format("Result: %.2f %s",
                    answer, toUnit));
        } catch (NumberFormatException ex) {
            result.setText("Enter a valid number.");
        }
    }
    public static void main(String[] args) {
        new Ex1213();
    }
}
}

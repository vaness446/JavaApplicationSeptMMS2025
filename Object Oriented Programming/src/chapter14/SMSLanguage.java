
package chapter14;

import java.awt.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
public class SMSLanguage {
    
public class Ex1428 extends JFrame {
    JTextArea input;
    JTextArea output;
    Map<String, String> smsToEnglish = new HashMap<>();
    public Ex1428() {
        smsToEnglish.put("imo", "in my opinion");
        smsToEnglish.put("brb", "be right back");
        smsToEnglish.put("lol", "laughing out loud");
        smsToEnglish.put("idk", "I don't know");
        smsToEnglish.put("omg", "oh my God");
        smsToEnglish.put("btw", "by the way");
        smsToEnglish.put("ttyl", "talk to you later");
        input = new JTextArea(8, 45);
        output = new JTextArea(8, 45);
        output.setEditable(false);
        JButton toEnglish = new JButton("SMS fi English");
        JButton toSMS = new JButton("English fi SMS");
        toEnglish.addActionListener(e -> translateToEnglish());
        toSMS.addActionListener(e -> translateToSMS());
        JPanel buttons = new JPanel();
        buttons.add(toEnglish);
        buttons.add(toSMS);
        add(new JScrollPane(input), BorderLayout.NORTH);
        add(buttons, BorderLayout.CENTER);
        add(new JScrollPane(output), BorderLayout.SOUTH);
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void translateToEnglish() {
        String result = input.getText();
        for (Map.Entry<String, String> entry :
                smsToEnglish.entrySet())
            result = result.replaceAll(
                "(?i)\\b" + entry.getKey() + "\\b",
                entry.getValue());
        output.setText(result);
    }
    void translateToSMS() {
        String result = input.getText();
        for (Map.Entry<String, String> entry :
                smsToEnglish.entrySet())
            result = result.replaceAll(
                "(?i)\\b" + entry.getValue() + "\\b",
                entry.getKey());
        output.setText(result);
    }
    public static void main(String[] args) {
        new Ex1428();
    }
}
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    private static JTextField display;
    private static double num1 = 0, num2 = 0, result = 0;
    private static String operator = "";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setSize(400, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Display Field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        // Buttons Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 4, 5, 5));

        String[] buttons = {
            "%", "CE", "C", "Del",
            "1/x", "x²", "√x", "÷",
            "7", "8", "9", "×",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "+/-", "0", ".", "="
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonText = e.getActionCommand();

            try {
                switch (buttonText) {
                    case "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "." ->
                        display.setText(display.getText() + buttonText);
                    case "+/-" -> {
                        double value = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(-value));
                    }
                    case "+", "-", "×", "÷" -> {
                        num1 = Double.parseDouble(display.getText());
                        operator = buttonText;
                        display.setText("");
                    }
                    case "=" -> {
                        num2 = Double.parseDouble(display.getText());
                        result = switch (operator) {
                            case "+" -> num1 + num2;
                            case "-" -> num1 - num2;
                            case "×" -> num1 * num2;
                            case "÷" -> (num2 != 0) ? num1 / num2 : Double.NaN;
                            default -> throw new IllegalStateException("Unexpected operator: " + operator);
                        };
                        display.setText(String.valueOf(result));
                    }
                    case "C" -> {
                        display.setText("");
                        num1 = num2 = result = 0;
                        operator = "";
                    }
                    case "CE" -> display.setText("");
                    case "Del" -> {
                        String currentText = display.getText();
                        if (!currentText.isEmpty()) {
                            display.setText(currentText.substring(0, currentText.length() - 1));
                        }
                    }
                    case "%" -> {
                        double value = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(value / 100));
                    }
                    case "√x" -> {
                        double value = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(Math.sqrt(value)));
                    }
                    case "x²" -> {
                        double value = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(value * value));
                    }
                    case "1/x" -> {
                        double value = Double.parseDouble(display.getText());
                        display.setText(value != 0 ? String.valueOf(1 / value) : "Error");
                    }
                    default -> display.setText("Error");
                }
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        }
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilesKMConverter extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel outputLabel;
    private JButton kmToMilesButton;
    private JButton milesToKmButton;

    public MilesKMConverter() {
        super("Miles to Kms Converter");

        inputField = new JTextField(20);
        inputField.setHorizontalAlignment(JTextField.CENTER);

        outputLabel = new JLabel("Enter a value and select a conversion type");

        
        kmToMilesButton = new JButton("Kms to Miles");
        milesToKmButton = new JButton("Miles to Kms");
        kmToMilesButton.addActionListener(this);
        milesToKmButton.addActionListener(this);

        
        Container control = getContentPane();
        control.setLayout(new FlowLayout());
        control.setBackground(Color.RED);
        control.setBackground(Color.GREEN); 
        control.add(inputField);
        control.add(kmToMilesButton);
        control.add(milesToKmButton);
        control.add(outputLabel);

        
        setSize(300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        double value = 0;
        try {
            value = Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            outputLabel.setText("Invalid input");
            return;
        }

        if (e.getSource() == kmToMilesButton) {
            double result = value * 0.621371;
            outputLabel.setText(value + " km = " + result + " miles");
        } else if (e.getSource() == milesToKmButton) {
            double result = value * 1.60934;
            outputLabel.setText(value + " miles = " + result + " km");
        }
    }

    public static void main(String[] args) {
        new MilesKMConverter();
    }
}

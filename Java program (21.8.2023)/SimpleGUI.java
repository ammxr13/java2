import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI extends JFrame {
    private JTextField inputField;
    private JLabel outputLabel;
    private int clickCount = 0;

    public SimpleGUI() {
        // Set up the frame
        setTitle("Simple GUI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create components
        JLabel inputLabel = new JLabel("Enter your name:");
        inputField = new JTextField(15);
        JButton greetButton = new JButton("Greet");
        JButton countButton = new JButton("Count Clicks");
        outputLabel = new JLabel("Output will appear here");

        // Add action listener to the greet button
        greetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = inputField.getText();
                if (name.trim().isEmpty()) {
                    outputLabel.setText("Please enter a name!");
                } else {
                    outputLabel.setText("Hello, " + name + "!");
                }
            }
        });

        // Add action listener to the count button
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                outputLabel.setText("Button clicked: " + clickCount + " times");
            }
        });

        // Add components to the frame
        add(inputLabel);
        add(inputField);
        add(greetButton);
        add(countButton);
        add(outputLabel);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleGUI().setVisible(true);
            }
        });
    }
}

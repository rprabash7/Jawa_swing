import javax.swing.*;
import java.awt.event.*;

class SwapNumbers implements ActionListener {
    // Declare instance variables
    private JTextField num1Field, num2Field;
    private JLabel beforeLabel, afterLabel;

    // Constructor
    SwapNumbers() {
        JFrame frame = new JFrame("Swapping Two Numbers");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create Labels
        JLabel label = new JLabel("Enter Two Numbers:");
        label.setBounds(50, 30, 200, 20);

        beforeLabel = new JLabel("Before Swapping: ");
        beforeLabel.setBounds(50, 150, 300, 20);

        afterLabel = new JLabel("After Swapping: ");
        afterLabel.setBounds(50, 180, 300, 20);

        // Create Text Fields
        num1Field = new JTextField();
        num1Field.setBounds(50, 60, 100, 20);

        num2Field = new JTextField();
        num2Field.setBounds(200, 60, 100, 20);

        // Create Button
        JButton swapButton = new JButton("Swap");
        swapButton.setBounds(150, 100, 100, 30);
        swapButton.addActionListener(this); // Add Action Listener to Button

        // Add Components to Frame
        frame.add(label);
        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(swapButton);
        frame.add(beforeLabel);
        frame.add(afterLabel);

        // Set Frame Visible
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
            int a = Integer.parseInt(num1Field.getText());
            int b = Integer.parseInt(num2Field.getText());

            // Before Swapping
            String before = "Before Swapping: a = " + a + ", b = " + b;
            beforeLabel.setText(before);

            // Swapping logic
            a = a + b;
            b = a - b;
            a = a - b;

            // After Swapping
            String after = "After Swapping: a = " + a + ", b = " + b;
            afterLabel.setText(after);
    }

    // Main Method
    public static void main(String[] args) {
        new SwapNumbers();
    }
}

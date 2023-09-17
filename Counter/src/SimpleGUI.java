import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    private int count = 0; // Integer to be displayed

    private JLabel countLabel;
    private JButton incrementButton;
    private JButton decrementButton;
    private JButton resetButton;

    public SimpleGUI() {
        setTitle("Simple Integer Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLayout(new BorderLayout());

        // Create the label to display the integer
        countLabel = new JLabel(Integer.toString(count), JLabel.CENTER);
        countLabel.setFont(new Font("Arial", Font.PLAIN, 40));
        add(countLabel, BorderLayout.CENTER);

        // Create the buttons
        JPanel buttonPanel = new JPanel();
        incrementButton = new JButton("Increment");
        decrementButton = new JButton("Decrement");
        resetButton = new JButton("Reset");

        // Add action listeners to the buttons
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText(Integer.toString(count));
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                countLabel.setText(Integer.toString(count));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = 0;
                countLabel.setText(Integer.toString(count));
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleGUI();
            }
        });
    }
}


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator implements ActionListener{
// Create instances
    JFrame frame;
    JTextField textField;
    JButton[] numButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8]
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JButton panel;

// Sett font

    Font myFont = new Font("Ink Free",Font.BOLD,30);

    Calculator(){

    }
    public static void main(String[] args) throws Exception {
        
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

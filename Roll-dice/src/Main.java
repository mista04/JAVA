import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("Twenty_sided_dice.png");

        JLabel label = new JLabel();
        label.setText("ROLL DICE");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green); //set color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text

        JFrame frame = new JFrame("Roll dice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,380);
        frame.setVisible(true);
        frame.add(label);


    }
}
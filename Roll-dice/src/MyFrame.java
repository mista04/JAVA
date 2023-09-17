
import javax.swing.*;
public class MyFrame extends JFrame {

    MyFrame() {

        JLabel label = new JLabel();

        this.setTitle("Roll dice"); //Set the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of application
        this.setResizable(false); //Prevent from been resized
        this.setSize(420,270); //Set de size
        this.setVisible(true); //Make this visible

        ImageIcon image = new ImageIcon("Twenty_sided_dice.png");
        this.setIconImage(image.getImage()); //Change icon of this

        this.add(label);

    }
}
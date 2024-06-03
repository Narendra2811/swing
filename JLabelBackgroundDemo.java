import javax.swing.*;
import java.awt.*;

class JLabelBackgroundDemo extends JFrame {
    JLabel l1, l2;

    public JLabelBackgroundDemo()

    {
        setTitle("JLabel Background Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setVisible(true);
        // Create labels
        l1 = new JLabel("I am first label");
        l2 = new JLabel("I am second label");
        // Make opaque
        l1.setOpaque(true);
        l2.setOpaque(true);
        // Then, set background
        l1.setBackground(Color.cyan);
        l2.setBackground(Color.pink);
        // Add labels
        add(l1);
        add(l2);
    }

    public static void main(String args[]) {
        new JLabelBackgroundDemo();
    }
}
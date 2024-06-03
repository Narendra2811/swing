import java.awt.*;
import javax.swing.*;

public class panel_ex {
    panel_ex() {
        JFrame a1 = new JFrame("without panel");
        JButton b1 = new JButton("click me");
        b1.setBounds(60, 50, 80, 40);
        a1.add(b1);
        a1.setSize(400, 400);
        a1.setLayout(null);
        a1.setVisible(true);
        JFrame a = new JFrame("panel");
        JPanel p = new JPanel();
        p.setBounds(40, 70, 200, 200); // panel doesn't have border.. so we can't see panel borderJButton b = new JButton("click me");
        JButton b = new JButton("click me");
        p.setBackground(Color.BLUE);
        b.setBounds(60, 50, 80, 40);
        p.add(b);
        a.add(p);
        a.setSize(400, 400);
        a.setLayout(null);
        a.setVisible(true);
    }



    public static void main(String args[]) {
        new panel_ex();
    }
}
import javax.swing.*;
import javax.xml.crypto.Data;

public class java_table {
    JFrame f;

    java_table() {
        f = new JFrame();
        String data[][] = { { "101", "amit", "670000" },
                { "101", "amit", "670000" },
                { "101", "amit", "670000" },
                { "101", "amit", "670000" },
                { "101", "amit", "670000" }
        };
        String column[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);

        f.setSize(400, 400);
        f.setVisible(true);
    }

public static void main(String[] args) {
    new java_table();
}
}
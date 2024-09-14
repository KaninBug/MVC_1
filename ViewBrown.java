import java.awt.Color;

import javax.swing.*;

public class ViewBrown {
    JFrame brown;
    JPanel panel;
    Color colorBrown = new Color(153,102,0);

    ViewBrown() {
        brown = new JFrame("Register Brown");
        brown.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailBrown();
        brown.setLayout(null);
        brown.setVisible(true);
        brown.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailBrown() {
        
        panel = new JPanel();
        panel.setBackground(colorBrown);
        panel.setBounds(0, 0, 1920, 1080);
        brown.add(panel);
    }
}

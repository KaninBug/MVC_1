import java.awt.Color;

import javax.swing.*;

public class ViewWhite {
    JFrame white;
    JPanel panel;
    JLabel colorLabel;
    JTextField inputColor;
    JButton checkColor;
    String strColor;

    ViewWhite() {
        white = new JFrame("Register White");
        white.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailwhite();
        white.setLayout(null);
        white.setVisible(true);
        white.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailwhite() {
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 1920, 1080);
        white.add(panel);
    }
}

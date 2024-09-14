import java.awt.Color;

import javax.swing.*;

public class ViewPink {
    JFrame pink;
    JPanel panel;
    JLabel colorLabel;
    JTextField inputColor;
    JButton checkColor;
    String strColor;

    ViewPink() {
        pink = new JFrame("Register Pink");
        pink.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailpink();
        pink.setLayout(null);
        pink.setVisible(true);
        pink.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailpink() {
        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(0, 0, 1920, 1080);
        pink.add(panel);
    }
}

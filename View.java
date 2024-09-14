import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View {
    JFrame main;
    JPanel panel;
    JLabel colorLabel;
    JTextField inputColor;
    JButton checkColor;
    String strColor;

    View() {
        main = new JFrame("Register Cow's Color");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailSW();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailSW() {
        panel = new JPanel();
        colorLabel = new JLabel("color");
        inputColor = new JTextField();
        checkColor = new JButton("next");
        panel.setBackground(Color.lightGray);
        panel.setBounds(0, 0, 1920, 1080);
        colorLabel.setBounds(900,200,100,50);
        inputColor.setBounds(720,300,400,50);
        checkColor.setBounds(860,400,100,50);

        buttonAction();

        main.add(colorLabel);
        main.add(inputColor);
        main.add(checkColor);
        main.add(panel);
    }

    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        checkColor.addActionListener(listener);
    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            if(source == checkColor) {
                strColor = inputColor.getText().toLowerCase();
                Controller con = new Controller(strColor, 2);
                boolean checkCow = con.checkColorCow();
                if(checkCow == true) {
                    if(strColor.equals("white")) {
                        ViewWhite w = new ViewWhite();
                        main.dispose();
                    }
                    else if(strColor.equals("brown")) {
                        ViewBrown b = new ViewBrown();
                        main.dispose();
                    }
                    if(strColor.equals("pink")) {
                        ViewPink p = new ViewPink();
                        main.dispose();
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Color Not Match. Please input again.");
                }  
            }
        }
    }

    public static void main(String[] args) {
        View start = new View();
    }
}
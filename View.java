import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class View {
    JFrame main;
    JPanel panel;
    JLabel colorLabel;
    JTextField inputColor;
    JButton checkColor;
    String strColor;

    View() {
        main = new JFrame();
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
        panel.setLayout(null);
        colorLabel.setBounds(900,200,100,50);
        inputColor.setBounds(720,300,400,50);
        checkColor.setBounds(860,400,100,50);
        buttonAction();

        main.add(panel);
        main.add(colorLabel);
        main.add(inputColor);
        main.add(checkColor);

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
                strColor = inputColor.getText();
                Controller con = new Controller(strColor, 2);
                boolean checkCow = con.checkColorCow();
                if(checkCow == true) {
                    
                }
                else {
                    JOptionPane.showMessageDialog(null, "Nah");
                    System.out.println(checkCow);
                }  
            }
        }
    }

    public static void main(String[] args) {
        View start = new View();
    }
}
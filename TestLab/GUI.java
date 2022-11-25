package Java.TestLab;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel User = new JLabel();
        JLabel Pass = new JLabel();
        JTextField userText = new JTextField(20);
        JTextField PassText = new JTextField(20);

        // PANEL
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);

        // User
        User.setText("Username");
        User.setBounds(10, 20, 80, 25);
        panel.add(User);
        // UserText
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Pass
        Pass.setText("Password");
        Pass.setBounds(10, 50, 80, 25);
        panel.add(Pass);

        // PassText
        PassText.setBounds(100, 50, 165, 25);
        panel.add(PassText);

        frame.setVisible(true);

    }
}

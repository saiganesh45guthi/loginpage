package loginpage1;

import javax.swing.*;
import java.awt.*;

public class loginpage extends JFrame {
    private JTextField UserText;
    private JPanel panel1;
    private JPasswordField password;
    private JButton loginButton;
    private JFrame frame;

    public loginpage(){

        frame=new JFrame("Login Page");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250,200));
        frame.setResizable(false);

        frame.add(panel1);

        frame.pack();
        frame.setVisible(true);

    }
}

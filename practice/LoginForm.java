import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {

    // AWT Components
    Label userLabel, passLabel;
    TextField userText, passText;

    // Swing Component
    JButton loginButton;

    public LoginForm() {
        // Frame setup
        setTitle("Login Form (AWT + Swing)");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // AWT Labels
        userLabel = new Label("Username:");
        userLabel.setBounds(50, 50, 70, 20);
        add(userLabel);

        passLabel = new Label("Password:");
        passLabel.setBounds(50, 80, 70, 20);
        add(passLabel);

        // AWT TextFields
        userText = new TextField();
        userText.setBounds(130, 50, 150, 20);
        add(userText);

        passText = new TextField();
        passText.setEchoChar('*');
        passText.setBounds(130, 80, 150, 20);
        add(passText);

        // Swing Button
        loginButton = new JButton("Login");
        loginButton.setBounds(130, 110, 150, 25);
        add(loginButton);

        loginButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = passText.getText();

        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Credentials", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}

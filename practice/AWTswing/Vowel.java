package myfx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Vowel extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JButton countButton, resetButton, exitButton;

    public Vowel() {
        setTitle("Vowel Counter Application");
        setLayout(new GridLayout(4, 2, 10, 10));

        JLabel inputLabel = new JLabel("Enter a string:");
        inputField = new JTextField();
        JLabel outputLabel = new JLabel("Number of vowels:");
        outputField = new JTextField();
        outputField.setEditable(false);

        countButton = new JButton("Count Vowel");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        countButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

        add(inputLabel);
        add(inputField);
        add(outputLabel);
        add(outputField);
        add(countButton);
        add(resetButton);
        add(exitButton);

        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String text = inputField.getText();
            int count = countVowels(text);
            outputField.setText(String.valueOf(count));
        } else if (e.getSource() == resetButton) {
            inputField.setText("");
            outputField.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Vowel();
    }
}

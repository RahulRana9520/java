package myfx;

import javax.swing.*;
import java.awt.event.*;

public class MovieBooking extends JFrame implements ActionListener {
    JComboBox<String> movieBox, timeBox;
    JTextField ticketsField, costField;
    JButton confirmBtn, resetBtn, exitBtn;

    public MovieBooking() {
        setTitle("Movie Ticket Booking");
        setLayout(null);
        setSize(350, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel movieLabel = new JLabel("Movie:");
        movieLabel.setBounds(20, 20, 100, 25);
        add(movieLabel);

        movieBox = new JComboBox<>(new String[]{"Avatar", "Inception", "Interstellar"});
        movieBox.setBounds(120, 20, 180, 25);
        movieBox.setSelectedIndex(-1);
        add(movieBox);

        JLabel timeLabel = new JLabel("Showtime:");
        timeLabel.setBounds(20, 60, 100, 25);
        add(timeLabel);

        timeBox = new JComboBox<>(new String[]{"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM"});
        timeBox.setBounds(120, 60, 180, 25);
        timeBox.setSelectedIndex(-1);
        add(timeBox);

        JLabel ticketsLabel = new JLabel("Tickets:");
        ticketsLabel.setBounds(20, 100, 100, 25);
        add(ticketsLabel);

        ticketsField = new JTextField();
        ticketsField.setBounds(120, 100, 180, 25);
        add(ticketsField);

        JLabel costLabel = new JLabel("Total Cost:");
        costLabel.setBounds(20, 140, 100, 25);
        add(costLabel);

        costField = new JTextField();
        costField.setBounds(120, 140, 180, 25);
        costField.setEditable(false);
        add(costField);

        confirmBtn = new JButton("Confirm");
        confirmBtn.setBounds(20, 190, 90, 30);
        confirmBtn.addActionListener(this);
        add(confirmBtn);

        resetBtn = new JButton("Reset");
        resetBtn.setBounds(130, 190, 90, 30);
        resetBtn.addActionListener(this);
        add(resetBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setBounds(230, 190, 90, 30);
        exitBtn.addActionListener(this);
        add(exitBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmBtn) {
            confirmBooking();
        } else if (e.getSource() == resetBtn) {
            resetForm();
        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    private void confirmBooking() {
        String movie = (String) movieBox.getSelectedItem();
        String time = (String) timeBox.getSelectedItem();
        String ticketsStr = ticketsField.getText().trim();

        if (movie == null || time == null || ticketsStr.isEmpty() || !ticketsStr.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Please select movie, showtime and enter valid number of tickets.");
            return;
        }

        int tickets = Integer.parseInt(ticketsStr);
        int pricePerTicket = switch (movie) {
            case "Avatar" -> 250;
            case "Inception" -> 200;
            case "Interstellar" -> 220;
            default -> 0;
        };

        int totalCost = tickets * pricePerTicket;
        costField.setText(String.valueOf(totalCost));

        JOptionPane.showMessageDialog(this, "Booking confirmed for " + movie + " at " + time +
                "\nTickets: " + tickets + "\nTotal cost: ₹" + totalCost);
    }

    private void resetForm() {
        movieBox.setSelectedIndex(-1);
        timeBox.setSelectedIndex(-1);
        ticketsField.setText("");
        costField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MovieBooking mb = new MovieBooking();
            mb.setVisible(true);
        });
    }
}

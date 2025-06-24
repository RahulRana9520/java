import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class Data extends JFrame {
    JTextField empNameField, empCodeField, designationField, salaryField;
    JButton saveBtn, resetBtn, exitBtn, viewBtn;
    JPanel p1, p2;
    Connection con;
    PreparedStatement pst;

    public Data(){
        setTitle("Employee Database");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Panel for form fields
        p1 = new JPanel(new GridLayout(4, 2, 10, 10));
        p2 = new JPanel(new FlowLayout());

        // Input fields
        p1.add(new JLabel("Employee Code (int):"));
        empCodeField = new JTextField();
        p1.add(empCodeField);

        p1.add(new JLabel("Employee Name:"));
        empNameField = new JTextField();
        p1.add(empNameField);

        p1.add(new JLabel("Designation:"));
        designationField = new JTextField();
        p1.add(designationField);

        p1.add(new JLabel("Salary (double):"));
        salaryField = new JTextField();
        p1.add(salaryField);

        // Buttons
        saveBtn = new JButton("Save");
        resetBtn = new JButton("Reset");
        exitBtn = new JButton("Exit");
        viewBtn = new JButton("View");

        p2.add(saveBtn);
        p2.add(resetBtn);
        p2.add(viewBtn);
        p2.add(exitBtn);

        add(p1);
        add(p2);

        // DB Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ok", "root", "");
            System.out.println("Database connected!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection failed: " + e.getMessage());
            e.printStackTrace();
        }

        // Save button action
        saveBtn.addActionListener(e -> {
            try {
                String sql = "INSERT INTO mydb (empcode, empname, designation, dno) VALUES (?, ?, ?, ?)";
                pst = con.prepareStatement(sql);
                pst.setInt(1, Integer.parseInt(empCodeField.getText()));
                pst.setString(2, empNameField.getText());
                pst.setString(3, designationField.getText());
                pst.setDouble(4, Double.parseDouble(salaryField.getText()));
                int rows = pst.executeUpdate();
                if (rows > 0) {
                    JOptionPane.showMessageDialog(this, "Employee data saved successfully!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error saving data: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        // Reset button action
        resetBtn.addActionListener(e -> {
            empCodeField.setText("");
            empNameField.setText("");
            designationField.setText("");
            salaryField.setText("");
        });

        // View button action
        viewBtn.addActionListener(e -> {
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM sachin");
                StringBuilder sb = new StringBuilder();

                while (rs.next()) {
                    sb.append("Emp Code: ").append(rs.getInt("empcode"))
                      .append(", Name: ").append(rs.getString("empname"))
                      .append(", Designation: ").append(rs.getString("designation"))
                      .append(", Salary: ").append(rs.getDouble("dno"))
                      .append("\n");
                }

                JTextArea textArea = new JTextArea(sb.toString());
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(350, 200));

                JOptionPane.showMessageDialog(this, scrollPane, "Employee Records", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error retrieving data: " + ex.getMessage());
                ex.printStackTrace();
            }
        });

        // Exit button action
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Data());
    }
}

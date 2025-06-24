import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        Button b = new Button("Click Me");

        b.setBounds(100, 100, 80, 30);

        b.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(b);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close window on exit
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

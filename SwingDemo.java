import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingDemo extends JFrame {
    private JTextField textField;
    private JLabel label;

    public SwingDemo() {
        setTitle("Swing GUI Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        JButton button = new JButton("Submit");
        label = new JLabel("Enter your name above.");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello, " + textField.getText() + "!");
            }
        });

        add(textField);
        add(button);
        add(label);
    }

    public static void main(String[] args) {
        SwingDemo frame = new SwingDemo();
        frame.setVisible(true);
    }
}
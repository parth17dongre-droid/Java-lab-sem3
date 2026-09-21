import javax.swing.*;
import java.awt.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nameLabel = new JLabel(" Name:");
        JTextField nameText = new JTextField();
        JLabel rollLabel = new JLabel(" Roll No:");
        JTextField rollText = new JTextField();
        JLabel courseLabel = new JLabel(" Course:");
        JTextField courseText = new JTextField();
        JButton submitBtn = new JButton("Register");

        frame.add(nameLabel);
        frame.add(nameText);
        frame.add(rollLabel);
        frame.add(rollText);
        frame.add(courseLabel);
        frame.add(courseText);
        frame.add(new JLabel(""));
        frame.add(submitBtn);

        frame.setVisible(true);
    }
}
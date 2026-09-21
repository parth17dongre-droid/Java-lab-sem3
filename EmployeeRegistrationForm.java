import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel idLabel = new JLabel(" Employee ID:");
        JTextField idText = new JTextField();
        JLabel nameLabel = new JLabel(" Name:");
        JTextField nameText = new JTextField();
        JLabel deptLabel = new JLabel(" Department:");
        JTextField deptText = new JTextField();
        JLabel salaryLabel = new JLabel(" Salary:");
        JTextField salaryText = new JTextField();
        JButton submitBtn = new JButton("Submit");

        frame.add(idLabel);
        frame.add(idText);
        frame.add(nameLabel);
        frame.add(nameText);
        frame.add(deptLabel);
        frame.add(deptText);
        frame.add(salaryLabel);
        frame.add(salaryText);
        frame.add(new JLabel(""));
        frame.add(submitBtn);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String info = "ID: " + idText.getText() +
                              "\nName: " + nameText.getText() +
                              "\nDepartment: " + deptText.getText() +
                              "\nSalary: " + salaryText.getText();
                JOptionPane.showMessageDialog(frame, info, "Employee Details", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
import java.util.Scanner;

public class LoginSystem {
    public static void checkPassword(String password) throws Exception {
        if (!"admin123".equals(password)) {
            throw new Exception("Invalid password provided.");
        }
        System.out.println("Login successful!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();

        try {
            checkPassword(pwd);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Login process executed.");
            scanner.close();
        }
    }
}
import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class DrivingLicenseSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new UnderageException("Age is below 18. Not eligible for a driving license.");
            }
            System.out.println("You are eligible for a driving license.");
        } catch (UnderageException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
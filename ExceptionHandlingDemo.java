import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int userAge = scanner.nextInt();

            validateAge(userAge);

        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught Exception: Invalid input type. Please enter a number.");

        } finally {
            System.out.println("Execution completed: Closing resources in the finally block.");
            scanner.close();
        }
    }
}
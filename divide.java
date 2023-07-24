import java.util.Scanner;

public class DivideByZeroExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = scanner.nextInt();

            int quotient = divide(dividend, divisor);

            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred");
        } finally {
            System.out.println("Finally block executed");
        }
        
        scanner.close();
    }

    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

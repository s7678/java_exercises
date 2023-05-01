import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        num2 = scanner.nextDouble();

        System.out.println("Choose operation");
        char operation = scanner.next().charAt(0);
        double result=0;

        switch (operation) {
            case '+':
                result = num1 + num2;

                break;
            case '-':
                result = num1 - num2;

                break;
            case '*':
                result = num1 * num2;

                break;
            case '/':
                result = num1 / num2;

                break;
            default:
                System.out.println("Incorrect input");
                return;

        }

        System.out.println("The result is " + result);

    }
}

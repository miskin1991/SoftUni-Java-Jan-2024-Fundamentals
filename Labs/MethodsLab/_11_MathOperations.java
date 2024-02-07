package Labs.MethodsLab;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = Double.parseDouble(scanner.nextLine());
        char operation = scanner.nextLine().charAt(0);
        double operand2 = Double.parseDouble(scanner.nextLine());
        printResult(operation, operand1, operand2);
    }

    private static void printResult(char operation, double operand1, double operand2) {
        double result = 0;

        switch (operation) {
            case '+':
                result = add(operand1, operand2);
                break;
            case '*':
                result = multiply(operand1, operand2);
                break;
            case '-':
                result = subtract(operand1, operand2);
                break;
            case '/':
                result = divide(operand1, operand2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
        System.out.printf("%.0f", result);
    }

    private static double add(double first, double second) {
        return first + second;
    }
    private static double multiply(double first, double second) {
        return first * second;
    }
    private static double subtract(double first, double second) {
        return first - second;
    }
    private static double divide(double first, double second) {
        return first / second;
    }
}

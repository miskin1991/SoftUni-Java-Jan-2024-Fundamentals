package Labs.MethodsLab;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        int operand1 = Integer.parseInt(scanner.nextLine());
        int operand2 = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                add(operand1, operand2);
                break;
            case "multiply":
                multiply(operand1, operand2);
                break;
            case "subtract":
                subtract(operand1, operand2);
                break;
            case "divide":
                divide(operand1, operand2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void add(int a, int b) {
        System.out.println(a + b);
    }
}

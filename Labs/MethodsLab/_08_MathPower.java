package Labs.MethodsLab;

import java.util.Scanner;

public class _08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.0f", mathPower(number, power));
    }

    private static double mathPower(double number, int power) {
        double result = number;
        for (int i = 1; i < power; i++) {
            result *= number ;
        }
        return result;
    }
}

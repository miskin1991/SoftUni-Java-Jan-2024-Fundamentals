package Labs.MethodsLab;

import java.util.Scanner;

public class _01_SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number == 0) System.out.printf("The number %d is zero.", number);
        else if(isPositive(number)) System.out.printf("The number %d is positive.", number);
        else System.out.printf("The number %d is negative.", number);
    }

    private static boolean isPositive(int number) {
        return (number > 0);
    }
}

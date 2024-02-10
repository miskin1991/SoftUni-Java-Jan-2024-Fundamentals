package Exercises.MethodsExercise;

import java.util.Scanner;

public class _05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int result = add(a, b);
        result = subtract(result, c);
        System.out.println(result);
    }
    private static int add(int a, int b) {
        return (a + b);
    }
    private static int subtract(int a, int b) {
        return (a - b);
    }
}

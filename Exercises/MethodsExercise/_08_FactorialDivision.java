package Exercises.MethodsExercise;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        long factA = getFactorial(a);
        long factB = getFactorial(b);
        double division = (double) factA / factB;
        System.out.printf("%.2f", division);
    }

    private static long getFactorial(int n) {
        if (n == 1) return 1;
        else return (n * getFactorial(n - 1));
    }
}

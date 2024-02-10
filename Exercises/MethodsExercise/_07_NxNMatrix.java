package Exercises.MethodsExercise;

import java.util.Scanner;

public class _07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            printLine(n);
        }
    }

    private static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }
}

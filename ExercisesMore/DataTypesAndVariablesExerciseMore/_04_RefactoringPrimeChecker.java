package ExercisesMore.DataTypesAndVariablesExerciseMore;

import java.util.Scanner;

public class _04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int divider = 2; divider < i; divider++) {
                if (i % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }
    }
}

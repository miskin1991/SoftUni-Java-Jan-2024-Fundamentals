package BasicSyntaxExercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = end;

        for (int i = start; i < end; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("%d%n", end);
        System.out.println("Sum: " + sum);
    }
}
package Exercises.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < numbers; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}

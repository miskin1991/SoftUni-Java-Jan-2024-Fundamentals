package ExercisesMore.ArrayExerciseMore;

import java.util.Scanner;

public class _03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(GetFibonacci(n));

    }

    /**
     * Method that calculates the Fibonacci sequence of a number
     * @param number: the sequence starting point
     * @return the value of the fibonacci calculation
     */
    private static int GetFibonacci(int number) {
        if (number == 2 || number == 1) {
            return 1;
        }
        else {
            return (GetFibonacci(number - 1) + GetFibonacci(number - 2));
        }
    }
}

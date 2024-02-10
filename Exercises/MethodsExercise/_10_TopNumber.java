package Exercises.MethodsExercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            printTopNumber(Integer.toString(i));
        }
    }
    private static void printTopNumber(String number) {
        boolean sumEqualsEight = sumEqualsEight(number);
        boolean hasOneOdd = holdsOddDigit(number);
        if (sumEqualsEight && hasOneOdd) System.out.println(number);
    }
    private static boolean sumEqualsEight(String number) {
        int sum = 0;
        for (char symbol : number.toCharArray()) {
            int value = Integer.parseInt(symbol + "");
            sum += value;
        }
        return (sum % 8 == 0);
    }
    private static boolean holdsOddDigit(String number) {
        for (char symbol : number.toCharArray()) {
            int value = Integer.parseInt(symbol + "");
            if (value % 2 == 1) return  true;
        }
        return false;
    }
}

package BasicSyntaxExercise;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int sumOfFactorials = 0;

        for (int i = 0; i <= number.length() - 1; i++) {
            int value = Integer.parseInt(number.charAt(i) + "");
            sumOfFactorials += getFactorial(value);
        }

        int numberInt = Integer.parseInt(number);
        if (sumOfFactorials == numberInt) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static int getFactorial(int value) {
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
            factorial *= i;
        }
        return  factorial;
    }
}
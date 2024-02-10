package Exercises.MethodsExercise;

import java.util.Scanner;

public class _09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while(!command.equals("END")) {
            String reverseNumber = getReverse(command);
            System.out.println(command.equals(reverseNumber));
            command = scanner.nextLine();
        }
    }

    private static String getReverse(String input) {
        String output = "";
        for (int i = input.length() - 1; i > -1; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}

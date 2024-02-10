package Exercises.MethodsExercise;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(getMiddleChars(word));
    }

    private static String getMiddleChars(String word) {
        if (word.length() % 2 == 0) {
            return "" + word.charAt(word.length() / 2 - 1 ) + word.charAt(word.length() / 2);
        } else {
            return "" + word.charAt(word.length() / 2);
        }
    }
}

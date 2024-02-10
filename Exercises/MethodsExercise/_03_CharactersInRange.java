package Exercises.MethodsExercise;

import java.util.Scanner;

public class _03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);
        if (endChar > startChar) printChars(startChar, endChar);
        else printChars(endChar, startChar);
    }

    private static void printChars(char start, char end) {
        for (char i = ++start; i < end; i++){
            System.out.printf("%c ", i);
        }
    }

}


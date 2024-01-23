package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            char first = (char) ((int) 'a' + i);
            for (int j = 0; j < input; j++) {
                char second = (char) ((int) 'a' + j);
                for (int k = 0; k < input; k++) {
                    char third = (char) ((int) 'a' + k);
                    System.out.printf("%c%c%c%n",
                            first, second, third);
                }
            }
        }
    }
}

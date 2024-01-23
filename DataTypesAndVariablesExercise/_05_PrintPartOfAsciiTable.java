package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _05_PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i < end; i++) {
            System.out.printf("%c ", i);
        }
        System.out.println((char)end);

    }
}

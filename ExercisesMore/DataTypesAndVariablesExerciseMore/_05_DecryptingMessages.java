package ExercisesMore.DataTypesAndVariablesExerciseMore;

import java.util.Scanner;

public class _05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";
        for (int i = 0; i < n; i++) {
            char c = scanner.nextLine().charAt(0);
            c += (char) key;
            output += c;
        }
        System.out.println(output);
    }
}

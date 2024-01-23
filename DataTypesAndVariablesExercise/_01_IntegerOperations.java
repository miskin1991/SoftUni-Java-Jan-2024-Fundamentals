package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputs = { 0, 0, 0, 0 };

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(scanner.nextLine());
        }

        long result = (long) ((inputs[0] + inputs[1]) / inputs[2])
                        * inputs[3];
        System.out.println(result);
    }
}

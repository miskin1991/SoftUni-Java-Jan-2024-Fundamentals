package ExercisesMore.DataTypesAndVariablesExerciseMore;

import java.util.Scanner;

public class _03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double epsilon = 0.000001;
        double numA = Double.parseDouble(scanner.nextLine());
        double numB = Double.parseDouble(scanner.nextLine());
        double diff = Math.abs(Math.abs(numA) - Math.abs(numB));
        boolean equal = diff < epsilon;
        if (equal) System.out.println("True");
        else System.out.println("False");
    }
}

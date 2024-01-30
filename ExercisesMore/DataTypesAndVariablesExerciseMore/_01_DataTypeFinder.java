package ExercisesMore.DataTypesAndVariablesExerciseMore;

import java.util.Scanner;

public class _01_DataTypeFinder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        while(!input.matches("END")) {
            if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                System.out.println(input + " is boolean type");
            } else if (input.matches("-?\\d+")) {
                System.out.println(input + " is integer type");
            } else if (input.matches("-?\\d+.\\d+")) {
                System.out.println(input + " is floating point type");
            } else if (input.matches("\\D")) {
                System.out.println(input + " is character type");
            } else {
                System.out.println(input + " is string type");
            }
            input = scanner.nextLine();
        }
    }
}

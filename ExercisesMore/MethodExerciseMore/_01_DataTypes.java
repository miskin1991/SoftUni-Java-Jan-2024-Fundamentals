package ExercisesMore.MethodExerciseMore;

import java.util.Scanner;

public class _01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String value = scanner.nextLine();
        if (type.equals("int")) printOutput(Integer.parseInt(value));
        else if (type.equals("real")) printOutput(Double.parseDouble(value));
        else printOutput(value);
    }
    private static void printOutput(int value){
        System.out.println(value * 2);
    }
    private static void printOutput(double value){
        System.out.printf("%.2f", value * 1.5);
    }
    private static void printOutput(String value){
        System.out.printf("$%s$", value);
    }
}

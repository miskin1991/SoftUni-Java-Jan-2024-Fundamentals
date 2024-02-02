package Exercises.ArraysExercise;

import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String firstElement : secondArray) {
            for (String secondElement : firstArray)
                if (firstElement.equals(secondElement)) System.out.printf("%s ", firstElement);
        }
    }
}

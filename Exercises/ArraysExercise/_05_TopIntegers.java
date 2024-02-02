package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] >= array[i]) {
                        max = array[j];
                        i = j;
                }
            }
            System.out.printf("%d ", max);
        }
        System.out.println();
    }
}

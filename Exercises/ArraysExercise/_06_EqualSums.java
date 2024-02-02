package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    sumLeft += array[j];
                }
            }
            int sumRight = 0;
            if (i < array.length - 1) {
                for (int j = array.length - 1; j > i; j--) {
                    sumRight += array[j];
                }
            }
            if (sumRight == sumLeft) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}

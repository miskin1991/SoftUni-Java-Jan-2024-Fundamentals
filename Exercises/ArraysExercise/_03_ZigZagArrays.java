package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {
            int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                firstArr[i] = inputArr[0];
                secondArr[i] = inputArr[1];
            } else {
                firstArr[i] = inputArr[1];
                secondArr[i] = inputArr[0];
            }
        }

        printArr(firstArr);
        printArr(secondArr);
    }

    /**
     * Method to print array in 1 single line.
     * @param array: array to be printed out
     */
    private static void printArr(int[] array) {
        for (int element : array) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }
}

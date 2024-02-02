package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        while (array.length != 1) {
            array = getCondenseArray(array);
        }
        System.out.println(array[0]);
    }

    /**
     * Method to condense a single array
     * @param array: input array to condense
     * @return the condensed array
     */
    private static int[] getCondenseArray(int[] array) {
        int[] condense = new int[array.length - 1];
        for (int j = 0; j < condense.length; j++) {
            condense[j] = array[j] + array[j + 1];
        }
        return condense;
    }
}

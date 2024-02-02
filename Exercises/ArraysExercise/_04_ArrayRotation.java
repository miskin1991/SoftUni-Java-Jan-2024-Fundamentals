package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        int length = inputArr.length;
        if (n >= length) n %= length;

        int[] outArr = new int[length];

        for (int i = 0; i < length; i++, n++) {
            if (n == length) n = 0;
            outArr[i] = inputArr[n];
        }

        for (int element : outArr) {
            System.out.printf("%d ", element);
        }
        System.out.println();

    }
}

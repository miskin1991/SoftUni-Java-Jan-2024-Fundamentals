package ExercisesMore.MethodExerciseMore;

import java.util.Scanner;

public class _05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        if (isAnyZero(array)) System.out.println("zero");
        else if(oddsNegativeNumsInSeq(array)) System.out.println("positive");
        else System.out.println("negative");

    }
    private static boolean oddsNegativeNumsInSeq(int[] array) {
        int negativeNums = 0;
        for (int i : array) {
            if (i < 0) negativeNums++;
        }
        return ((negativeNums % 2) == 0);
    }
    private static boolean isAnyZero(int[] array) {
        for (int i : array) {
            if (i == 0) return true;
        }
        return false;
    }
}

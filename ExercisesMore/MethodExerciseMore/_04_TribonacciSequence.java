package ExercisesMore.MethodExerciseMore;

import java.util.Scanner;

public class _04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] sequence = new int[n];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = getNextTribonacciNum(i, sequence);
        }
        for (int value : sequence) System.out.printf("%d ", value);
    }
    private static int getNextTribonacciNum(int index, int[] array) {
        if(index == 0) return 1;
        else if (index == 1) return (array[index - 1]);
        else if (index == 2) return (array[index - 1] + array[index - 2]);
        else return (array[index - 1] + array[index - 2] + array[index -3]);
    }
}

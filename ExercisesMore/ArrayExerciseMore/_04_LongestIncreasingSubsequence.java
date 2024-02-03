package ExercisesMore.ArrayExerciseMore;

import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbs = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] len = new int[numbs.length];
        Arrays.fill(len, 1);
        int[] prev = new int[numbs.length];
        Arrays.fill(prev, -1);

        for (int i = 0; i < numbs.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((numbs[j] < numbs[i]) && (len[i] < len[j] + 1)) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }
        }

        int ans = len[0], pos = 0;
        for (int i = 1; i < numbs.length; i++) {
            if (len[i] > ans) {
                ans = len[i];
                pos = i;
            }
        }

        int[] solution = new int[Arrays.stream(len).max().getAsInt()];
        int count = solution.length - 1;
        while (pos != -1) {
            solution[count--] = numbs[pos];
            pos = prev[pos];
        }

        for(int element : solution) System.out.printf("%d ", element);
        System.out.println();
    }
}


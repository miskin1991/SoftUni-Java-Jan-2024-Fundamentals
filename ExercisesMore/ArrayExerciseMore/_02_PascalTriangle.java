package ExercisesMore.ArrayExerciseMore;

import java.util.Arrays;
import java.util.Scanner;

public class _02_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] triangle = new int[n][n + 1];

        for (int[] row : triangle) Arrays.fill(row, 0);

        for (int i = 0; i < triangle.length; i++)
            for (int j = 0; j < triangle[i].length - 1; j++) {
                if (j == 0) triangle[i][j] = 1;
                else if (i > 0) triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

        for (int[] row : triangle) {
            for (int col : row) if (col > 0) System.out.printf("%d ", col);
            System.out.println();
        }
    }
}

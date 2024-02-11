package ExercisesMore.MethodExerciseMore;

import java.util.Scanner;

public class _02_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        double d1 = getDistanceFromCenter(x1, y1);
        double d2 = getDistanceFromCenter(x2, y2);
        if (d1 < d2) System.out.printf("(%d, %d)", x1, y1);
        else System.out.printf("(%d, %d)", x2, y2);
    }
    private static double getDistanceFromCenter(int a, int b){
        return Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
    }
}

package ExercisesMore.MethodExerciseMore;

import java.util.Scanner;

public class _03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());
        double d1 = getDistanceBetweenTwoPoints(x1, y1, x2, y2);
        double d2 = getDistanceBetweenTwoPoints(x3, y3, x4, y4);

        if (d1 >= d2) {
            printPoints(x1, y1, x2, y2);
        } else {
            printPoints(x3, y3, x4, y4);
        }

    }
    private static void printPoints(int x1, int y1, int x2, int y2) {
        double d1Center = getDistanceFromCenter(x1, y1);
        double d2Center = getDistanceFromCenter(x2, y2);
        if (d1Center <= d2Center) System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        else System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
    }

    private static double getDistanceFromCenter(int a, int b){
        return Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
    }
    private static double getDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));
    }
}

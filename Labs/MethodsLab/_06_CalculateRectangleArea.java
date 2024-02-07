package Labs.MethodsLab;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println(getRectangleArea(a, b));
    }

    private static int getRectangleArea(int a, int b) {
        return a * b;
    }
}

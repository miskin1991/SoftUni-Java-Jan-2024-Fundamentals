package Labs.MethodsLab;

import java.util.Scanner;

public class _03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.parseInt(scanner.nextLine());
        printTriangle(height);
    }

    static private void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}

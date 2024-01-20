package DataTypesAndVariablesLab;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= iterations; i++) {
            int sum = 0;
            int currentNumber = i;
            while (currentNumber > 0) {
                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }
            boolean result = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s%n", i, result ? "True" : "False");
        }
    }
}

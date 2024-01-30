package DataTypesAndVariablesExerciseMore;

import java.util.Scanner;

public class _06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int bracketCount = 0;
        boolean isBalanced = true;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                bracketCount++;
            } else if (input.equals(")")) {
                bracketCount--;
            }
            if (bracketCount < 0 || bracketCount > 1) {
                isBalanced = false;
            }
        }
        if (isBalanced) {
            System.out.printf("BALANCED%n");
        } else {
            System.out.printf("UNBALANCED%n");
        }
    }
}

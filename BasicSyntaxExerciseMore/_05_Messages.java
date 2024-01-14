package BasicSyntaxExerciseMore;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int iterations = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            String digits = scanner.nextLine();
            int number = Integer.parseInt(digits.charAt(0) + "");
            int count = digits.length();
            int mainDigit = (number - 2) * 3;
            if (number == 0) {
                message.append(" ");
                continue;
            }
            if (number >= 8) mainDigit++;
            char value = (char) (97 + mainDigit + count - 1);
            message.append(value);
        }
        System.out.println(message);
    }
}
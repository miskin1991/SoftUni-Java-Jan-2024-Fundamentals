package Labs.MethodsLab;

import java.util.Scanner;

public class _07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, repetitions));
    }

    private static String repeatString(String input, int repetitions) {
        String outputStr = "";
        for (int i = 0; i < repetitions; i++) {
            outputStr += input;
        }
        return outputStr;
    }
}

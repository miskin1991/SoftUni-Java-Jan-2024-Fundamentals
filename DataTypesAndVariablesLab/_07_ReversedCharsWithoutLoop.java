package DataTypesAndVariablesLab;

import java.util.Scanner;

public class _07_ReversedCharsWithoutLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.println("" + third + ' ' + second + ' ' + first);
    }
}

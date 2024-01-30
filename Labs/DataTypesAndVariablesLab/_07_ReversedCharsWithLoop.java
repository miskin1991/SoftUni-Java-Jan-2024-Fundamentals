package Labs.DataTypesAndVariablesLab;

import java.util.Scanner;

public class _07_ReversedCharsWithLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = "";
        for (int i = 0; i < 3; i++) {
            inputStr += scanner.nextLine().charAt(0);
        }

        String reverseStr = "";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reverseStr += inputStr.charAt(i);
            if (i != 0) reverseStr += ' ';
        }

        System.out.println(reverseStr);
    }
}

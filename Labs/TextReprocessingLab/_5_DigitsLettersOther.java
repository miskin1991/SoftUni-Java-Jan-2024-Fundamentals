package Labs.TextReprocessingLab;

import java.util.Scanner;

public class _5_DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (char symbol : line.toCharArray()) {
            if (Character.isDigit(symbol)){
                digit.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letter.append(symbol);
            } else other.append(symbol);
        }

        System.out.println(digit);
        System.out.println(letter);
        System.out.println(other);
    }
}

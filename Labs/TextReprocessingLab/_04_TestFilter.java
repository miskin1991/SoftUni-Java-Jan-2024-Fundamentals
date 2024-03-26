package Labs.TextReprocessingLab;

import java.util.Scanner;

public class _04_TestFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banned) {
            StringBuilder replacement = new StringBuilder(word.length());
            for (int i = 0; i < word.length(); i++) {
                replacement.append("*");
            }
            while (text.contains(word)) {
                text = text.replace(word, replacement.toString());
            }
        }
        System.out.println(text);
    }
}

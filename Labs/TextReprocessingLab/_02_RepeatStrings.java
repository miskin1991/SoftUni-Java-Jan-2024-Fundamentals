package Labs.TextReprocessingLab;

import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                builder.append(word);
            }
        }
        System.out.println(builder);
    }
}

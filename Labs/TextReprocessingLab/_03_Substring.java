package Labs.TextReprocessingLab;

import java.util.Scanner;

public class _03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String findInput = scanner.nextLine();
        String outputInput = scanner.nextLine();

        while (outputInput.contains(findInput)) {
            outputInput = outputInput.replace(findInput, "");
        }

        System.out.println(outputInput);
    }
}

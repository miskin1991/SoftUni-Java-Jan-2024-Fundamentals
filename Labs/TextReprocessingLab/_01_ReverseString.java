package Labs.TextReprocessingLab;

import java.util.Scanner;

public class _01_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String reverseLine = "";
            for (int i = line.length() - 1; i >= 0 ; i--) {
                reverseLine += line.charAt(i);
            }
            System.out.printf("%s = %s%n", line, reverseLine);
            line = scanner.nextLine();
        }
    }
}

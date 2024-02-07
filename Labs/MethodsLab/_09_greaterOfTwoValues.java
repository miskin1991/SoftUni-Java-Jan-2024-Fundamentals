package Labs.MethodsLab;

import java.util.Scanner;

public class _09_greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int": {
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.printf("%d%n", getMax(first, second));
                break;
            }
            case "char": {
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.printf("%c%n", getMax(first, second));
                break;
            }
            case "string": {
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.printf("%s", getMax(first, second));
            }
                break;
            default:
                break;
        }
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) return  first;
        else return second;
    }

    private static char getMax(char first, char second) {
        if (first > second) return first;
        else return second;
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }
}

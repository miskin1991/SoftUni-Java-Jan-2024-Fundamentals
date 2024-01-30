package Labs.DataTypesAndVariablesLab;

import java.util.Scanner;

public class _05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        String separator = scanner.nextLine();

        System.out.println(name + separator + surname);
    }
}

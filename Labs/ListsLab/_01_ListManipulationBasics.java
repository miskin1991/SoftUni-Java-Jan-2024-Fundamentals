package Labs.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Add":
                    list.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(Integer.parseInt(tokens[1])));
                    break;
                case "RemoveAt":
                    list.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    int number = Integer.parseInt(tokens[1]);
                    list.add(index, number);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        for (int element : list) System.out.printf("%d ", element);
    }
}

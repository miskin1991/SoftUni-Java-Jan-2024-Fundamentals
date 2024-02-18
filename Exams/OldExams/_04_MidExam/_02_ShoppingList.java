package Exams.OldExams._04_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Urgent": {
                    String item = tokens[1];
                    if (!list.contains(item))
                        list.add(0, item);
                    break;
                }
                case "Unnecessary": {
                    String item = tokens[1];
                    list.removeIf(element -> element.equals(item));
                    break;
                }
                case "Correct": {
                    String oldItem = tokens[1];
                    String newItem = tokens[2];
                    int index = list.indexOf(oldItem);
                    if (index >= 0) list.set(index, newItem);
                    break;
                }
                case "Rearrange": {
                    String item = tokens[1];
                    int index = list.indexOf(item);
                    if (index >= 0) {
                        list.remove(index);
                        list.add(item);
                    }
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
    }
}

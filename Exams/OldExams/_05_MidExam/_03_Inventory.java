package Exams.OldExams._05_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String[] tokens = command.split(" - ");
            switch (tokens[0]) {
                case "Collect": {
                    if (!inventory.contains(tokens[1])){
                        inventory.add(tokens[1]);
                    }
                    break;
                }
                case "Drop": {
                    inventory.remove(tokens[1]);
                    break;
                }
                case "Combine Items": {
                    String oldItem = tokens[1].split(":")[0];
                    String newItem = tokens[1].split(":")[1];
                    int index = inventory.indexOf(oldItem);
                    if (index >= 0) {
                        inventory.add(index + 1, newItem);
                    }
                    break;
                }
                case "Renew": {
                    int index = inventory.indexOf(tokens[1]);
                    if (index >= 0) {
                        inventory.add(inventory.get(index));
                        inventory.remove(index);
                    }
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(inventory.toString().replaceAll("[\\[\\]]", ""));
    }
}

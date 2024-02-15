package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Add":
                {
                    int number = Integer.parseInt(tokens[1]);
                    list.add(number);
                    break;
                }
                case "Insert":
                {
                    int number = Integer.parseInt(tokens[1]);
                    int index = Integer.parseInt(tokens[2]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.add(index, number);
                    break;
                }
                case "Remove":
                {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index");
                        break;
                    }
                    list.remove(index);
                    break;
                }
                case "Shift":
                {
                    String rotation = tokens[1];
                    int count = Integer.parseInt(tokens[2]);
                    if (rotation.equals("left")) {
                        for (int i = 0; i < count; i++) {
                            int number = list.get(0);
                            list.remove(0);
                            list.add(number);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            int number = list.get(list.size() - 1);
                            list.remove(list.size() - 1);
                            list.add(0, number);
                        }
                    }
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();;
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}

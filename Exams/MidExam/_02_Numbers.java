package Exams.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Add": {
                    int value = Integer.parseInt(tokens[1]);
                    list.add(value);
                    break;
                }
                case "Remove": {
                    int value = Integer.parseInt(tokens[1]);
                    list.remove(Integer.valueOf(value));
                    break;
                }
                case "Replace": {
                    int value = Integer.parseInt(tokens[1]);
                    int replacement = Integer.parseInt(tokens[2]);
                    int index = list.indexOf(value);
                    if (index >= 0) list.set(index, replacement);
                    break;
                }
                case "Collapse": {
                    int value = Integer.parseInt(tokens[1]);
                    list.removeIf(number -> number < value);
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}

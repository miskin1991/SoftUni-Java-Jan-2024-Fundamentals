package Exams.OldExams._03_MidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End") && !targets.isEmpty()) {
            String[] tokens = command.split(" ");
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);
            switch (tokens[0]) {
                case "Shoot": {
                    if (inRange(index, targets.size())) {
                        int health = targets.get(index);
                        health -= value;
                        if (health <= 0) targets.remove(index);
                        else targets.set(index, health);
                    }
                    break;
                }
                case "Add": {
                    if (inRange(index, targets.size())) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                }
                case "Strike": {
                    if (inRange(index - value, targets.size())
                            && inRange(index + value, targets.size())) {
                        targets.subList(index - value, index + value + 1).clear();
                    } else System.out.println("Strike missed!");
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        if (targets.isEmpty()) return;
        System.out.println(targets.toString().replaceAll("[\\[\\]]", "").replaceAll(", ", "|"));
    }

    static private boolean inRange(int index, int size) {
        return (index >= 0 && index < size);
    }
}

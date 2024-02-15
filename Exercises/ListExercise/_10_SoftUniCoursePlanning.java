package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> courses = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            switch (tokens[0]) {
                case "Add": {
                    if (!courses.contains(tokens[1]))
                        courses.add(tokens[1]);
                    break;
                }
                case "Insert": {
                    if (!courses.contains(tokens[1]))
                        courses.add(Integer.parseInt(tokens[2]), tokens[1]);
                    break;
                }
                case "Remove": {
                    courses.remove(tokens[1]);
                    break;
                }
                case "Swap": {
                    if (courses.contains(tokens[1]) && courses.contains(tokens[2])) {
                        int firstIndex = courses.indexOf(tokens[1]);
                        int secondIndex = courses.indexOf(tokens[2]);
                        courses.set(firstIndex, tokens[2]);
                        courses.set(secondIndex, tokens[1]);
                        if (courses.remove(tokens[1] + "-Exercise")) {
                            courses.add(courses.indexOf(tokens[1]) + 1, tokens[1] + "-Exercise");
                        }
                        if (courses.remove(tokens[2] + "-Exercise")) {
                            courses.add(courses.indexOf(tokens[2]) + 1, tokens[2] + "-Exercise");
                        }
                    }
                    break;
                }
                case "Exercise": {
                    if (courses.contains(tokens[1])) {
                        if (!courses.contains(tokens[1] + "-Exercise")) {
                            int index = courses.indexOf(tokens[1]);
                            courses.add(index + 1, tokens[1] + "-Exercise");
                        }
                    } else {
                        courses.add(tokens[1]);
                        courses.add(tokens[1] + "-Exercise");
                    }
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < courses.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courses.get(i));
        }
    }
}

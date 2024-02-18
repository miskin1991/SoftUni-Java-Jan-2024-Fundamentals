package Exams.OldExams._01_MidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(" "))
               .collect(Collectors.toList());

        int movements = 0;
        String command = scanner.nextLine();
        while (!command.equals("end") && !list.isEmpty()) {
            movements++;
            int[] indices = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (indices[0] < 0 || indices[0] >= list.size()
                    || indices[1] < 0 || indices[1] >= list.size() || indices[0] == indices[1]) {
                System.out.println("Invalid input! Adding additional elements to the board");
                int index = list.size() / 2;
                list.add(index, "-" + movements + "a");
                list.add(++index, "-" + movements + "a");
            } else {
                if(list.get(indices[0]).equals(list.get(indices[1]))) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", list.get(indices[0]));
                    list.remove(Math.max(indices[0], indices[1]));
                    list.remove(Math.min(indices[0], indices[1]));
                } else {
                    System.out.println("Try again!");
                }
            }
            command = scanner.nextLine();
        }
        if (list.isEmpty()) System.out.printf("You have won in %d turns!%n", movements);
        else {
            System.out.println("Sorry you lose :(");
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

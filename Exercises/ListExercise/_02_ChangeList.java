package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Delete")) {
                int number = Integer.parseInt(tokens[1]);
                list.removeIf(n -> n == number);
            } else {
                int index = Integer.parseInt(tokens[2]);
                int number = Integer.parseInt(tokens[1]);
                list.add(index, number);
            }
            command = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}

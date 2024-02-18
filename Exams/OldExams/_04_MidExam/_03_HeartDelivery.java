package Exams.OldExams._04_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> neighbour = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        int index = 0;
        while (!command.equals("Love!")) {
            if (command.contains("Jump")) {
                int length = Integer.parseInt(command.split(" ")[1]);
                index += length;
                if (index / neighbour.size() > 0) index = 0;
                int house = neighbour.get(index);
                if (house == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", index);
                } else {
                    house -= 2;
                    if (house < 0 ) house = 0;
                    if (house == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", index);
                    }
                    neighbour.set(index, house);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        int count = 0;
        for (int i = 0; i < neighbour.size(); i++) {
            if (neighbour.get(i) > 0) count++;
        }
        if (count > 0) System.out.printf("Cupid has failed %d places.%n", count);
        else System.out.println("Mission was successful.");
    }
}

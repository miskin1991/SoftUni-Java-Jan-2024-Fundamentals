package Exams.OldExams._03_MidExamRetake;

import java.util.Scanner;

public class _01_CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());

        int battles = 0;
        String command = scanner.nextLine();
        while(energy > 0 && !command.equals("End of battle")) {
            int distance = Integer.parseInt(command);
            if (energy >= distance) {
                energy -= distance;
                battles++;
                if (battles % 3 == 0) {
                    energy += battles;
                }
            } else {
                break;
            }
            command = scanner.nextLine();
        }
        if (energy >= 0 && command.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", battles, energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battles, energy);
        }
    }
}

package Exams.ExamPreparation._20240214_;

import java.util.Arrays;
import java.util.Scanner;

public class _02_ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] targets = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        int shots = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            int shot = -1;
            if (index >= 0 && index < targets.length) shot = targets[index];
            if (shot >= 0) {
                targets[index] = -1;
                for (int i = 0; i < targets.length; i++) {
                    if (targets[i] > shot) {
                        targets[i] -= shot;
                    } else if (targets[i] >= 0 && targets[i] <= shot)  {
                        targets[i] += shot;
                    } else {
                        targets[i] = -1;
                    }
                }
                shots++;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d ->", shots);
        for(int target : targets) System.out.printf(" %d", target);
        System.out.println();
    }
}

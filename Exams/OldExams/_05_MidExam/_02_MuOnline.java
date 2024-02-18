package Exams.OldExams._05_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> dungeons = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i < dungeons.size(); i++) {
            String[] tokens = dungeons.get(i).split(" ");
            if (tokens[0].equals("potion")) {
                int potion = Integer.parseInt(tokens[1]);
                if (health + potion > 100) {
                    potion = 100 - health;
                }
                health += potion;
                System.out.println("You healed for " + potion + " hp.");
                System.out.println("Current health: " + health + " hp.");
            } else if (tokens[0].equals("chest")) {
                bitcoins += Integer.parseInt(tokens[1]);
                System.out.println("You found " + tokens[1] + " bitcoins.");
            } else {
                health -= Integer.parseInt(tokens[1]);
                if (health > 0) {
                    System.out.println("You slayed " + tokens[0] + ".");
                } else {
                    System.out.println("You died! Killed by " + tokens[0] + ".");
                    System.out.println("Best room: " + (i + 1));
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d%n", health);
    }
}

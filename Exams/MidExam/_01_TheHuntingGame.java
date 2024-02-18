package Exams.MidExam;

import java.util.Scanner;

public class _01_TheHuntingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double water = days * players * Double.parseDouble(scanner.nextLine());
        double food = days * players * Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= days; i++) {
            double lostEnergy = Double.parseDouble(scanner.nextLine());
            energy -= lostEnergy;
            if (energy <= 0) {
                System.out.print("You will run out of energy. ");
                System.out.printf("You will be left with %.2f food and %.2f water.", food, water);
                System.out.println();
                i = days;
            } else {
                if (i % 2 == 0) {
                    energy *= 1.05;
                    water *= 0.70;
                }
                if (i % 3 == 0) {
                    food -= food / players;
                    energy *= 1.10;
                }
            }
        }
        if (energy > 0) {
            System.out.print("You are ready for the quest. ");
            System.out.printf("You will be left with - %.2f energy!", energy);
            System.out.println();
        }
    }
}

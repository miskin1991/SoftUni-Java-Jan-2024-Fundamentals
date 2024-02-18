package Exams.OldExams._06_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warship = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maximumHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Fire": {
                    int index = Integer.parseInt(tokens[1]);
                    int damage = Integer.parseInt(tokens[2]);
                    if (isValid(index, warship.size())) {
                        if(fire(index, damage, warship)) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                }
                case "Defend": {
                    int indexStart = Integer.parseInt(tokens[1]);
                    int indexEnd = Integer.parseInt(tokens[2]);
                    int damage = Integer.parseInt(tokens[3]);
                    if (isValid(indexStart, pirateShip.size())
                            && isValid(indexEnd, pirateShip.size())) {
                        for (int i = indexStart; i <= indexEnd; i++) {
                            if (fire(i, damage, pirateShip)) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                }
                case "Repair": {
                    int index = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);
                    if (isValid(index, pirateShip.size())) {
                        int sectionHealth = pirateShip.get(index);
                        sectionHealth += health;
                        if (sectionHealth > maximumHealth) sectionHealth = maximumHealth;
                        pirateShip.set(index, sectionHealth);
                    }
                    break;
                }
                case "Status": {
                    int count = 0;
                    double status = maximumHealth * 0.20;
                    for (int section : pirateShip) {
                        if (section < status) count++;
                    }
                    System.out.printf("%d sections need repair.%n", count);
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Pirate ship status: " + getSectionSum(pirateShip));
        System.out.println("Warship status: " + getSectionSum(warship));
    }
    private static boolean isValid(int index, int size) {
        return (index >= 0 && index < size);
    }

    /**
     * This method fires a section and check if it has broken.
     * @param index: section to damage
     * @param damage: attack damage
     * @param ship: the ship under attack
     * @return true if the section broke, false otherwise
     */
    private static boolean fire(int index, int damage, List<Integer> ship) {
        int health = ship.get(index);
        health -= damage;
        if (health > 0) {
            ship.set(index, health);
            return false;
        }
        return true;
    }
    private static int getSectionSum(List<Integer> ship) {
        int sum = 0;
        for (int section : ship) sum += section;
        return sum;
    }
}

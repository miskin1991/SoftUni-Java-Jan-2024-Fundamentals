package Exams.OldExams._06_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> loots = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Loot")) {
                for (int i = 1; i < tokens.length; i++) {
                    if (!loots.contains(tokens[i])) loots.add(0, tokens[i]);
                }
            } else if (tokens[0].equals("Drop")) {
                int index = Integer.parseInt(tokens[1]);
                if (index >= 0 && index < loots.size()) {
                    String loot = loots.get(index);
                    loots.remove(index);
                    loots.add(loot);
                }
            } else {
                int count = Integer.parseInt(tokens[1]);
                if (count >= loots.size()) {
                    System.out.println(loots.toString().replaceAll("[\\[\\]]", ""));
                    loots.clear();
                } else {
                    List<String> stolen = loots.subList(loots.size() - count, loots.size());
                    System.out.println(stolen.toString().replaceAll("[\\[\\]]", ""));
                    loots.removeAll(stolen);
                }
            }
            command = scanner.nextLine();
        }
        if (loots.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double gain = 0.0;
            for (String loot : loots) gain += loot.length();
            gain /= loots.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", gain);
        }
    }
}

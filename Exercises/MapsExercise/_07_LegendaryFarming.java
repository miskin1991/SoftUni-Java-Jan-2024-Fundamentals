package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        boolean keepGoing = true;
        while (keepGoing) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int value = Integer.parseInt(input[i]);
                String key = input[i + 1].toLowerCase();
                if (materials.containsKey(key)) {
                    materials.put(key, materials.get(key) + value);
                } else {
                    materials.put(key, value);
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    keepGoing = false;
                    break;
                }
                if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    keepGoing = false;
                    break;
                }
                if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    keepGoing = false;
                    break;
                }
            }
        }

        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

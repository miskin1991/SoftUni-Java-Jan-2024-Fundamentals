package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();
        while(!input.equals("stop")) {
            resources.putIfAbsent(input, 0);
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.put(input, resources.get(input) + quantity);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> resource : resources.entrySet()) {
            System.out.printf("%s -> %d%n", resource.getKey(), resource.getValue());
        }
    }
}

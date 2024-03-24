package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> results = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> submissions = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String language = tokens[1];
            if (language.equals("banned")) {
                results.remove(name);
            } else {
                int result = Integer.parseInt(tokens[2]);
                if (results.containsKey(name)) {
                    if (results.get(name) < result) {
                        results.put(name, result);
                    }
                } else {
                    results.put(name, result);
                }
                submissions.putIfAbsent(language, 0);
                submissions.put(language, submissions.get(language) + 1);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> result : results.entrySet()) {
            System.out.printf("%s | %d%n", result.getKey(), result.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> result : submissions.entrySet()) {
            System.out.printf("%s - %d%n", result.getKey(), result.getValue());
        }
    }
}

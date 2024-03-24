package ExercisesMore.MapsExerciseMore;

import java.util.*;

public class _01_Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, String> contests = new TreeMap<>();
        while (!input.equals("end of contests")) {
            String[] tokens = input.split(":");
            contests.put(tokens[0], tokens[1]);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Integer>> results = new TreeMap<>();
        LinkedHashMap<String, Integer> totalResults = new LinkedHashMap<>();
        while (!input.equals("end of submissions")) {
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String name = tokens[2];
            Integer result = Integer.parseInt(tokens[3]);
            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {
                    results.putIfAbsent(name, new LinkedHashMap<>());
                    if (results.get(name).containsKey(contest)) {
                        if (results.get(name).get(contest) < result)
                            results.get(name).put(contest, result);
                    } else {
                        results.get(name).put(contest, result);
                    }
                }
            }
            totalResults.putIfAbsent(name, 0);
            totalResults.put(name, totalResults.get(name) + result);
            input = scanner.nextLine();
        }

        Map.Entry<String, Integer> bestStudent = new AbstractMap.SimpleEntry<>("", 0);
        for (Map.Entry<String, LinkedHashMap<String, Integer>> result : results.entrySet()) {
            List<Map.Entry<String, Integer>> list =
                    new ArrayList<Map.Entry<String, Integer>>(result.getValue().entrySet());
            result.getValue().clear();
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue() - o1.getValue();
                }
            });
            int totalResult = 0;
            for (Map.Entry<String, Integer> element : list) {
                result.getValue().put(element.getKey(), element.getValue());
                totalResult += element.getValue();
            }
            if(bestStudent.getValue() <= totalResult) {
                bestStudent = new AbstractMap.SimpleEntry<>(result.getKey(), totalResult);
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", bestStudent.getKey(), bestStudent.getValue());
        System.out.println("Ranking:");
        for (Map.Entry<String, LinkedHashMap<String, Integer>> result : results.entrySet()) {
            System.out.println(result.getKey());
            for (Map.Entry<String, Integer> entry : result.getValue().entrySet()) {
                System.out.printf("#  %s -> %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}

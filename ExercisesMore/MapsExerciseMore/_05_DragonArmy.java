package ExercisesMore.MapsExerciseMore;

import java.util.*;
import java.util.stream.Collectors;

public class _05_DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> dragons = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> colorMeanStats = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> colorsCount = new LinkedHashMap<>();
        TreeMap<String, List<Integer>> dragonStats = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String color = tokens[0];
            String name = tokens[1];
            String key = color + "::" + name;
            String[] stats = Arrays.asList(
                    tokens[2].equals("null") ? "45" : tokens[2],
                    tokens[3].equals("null") ? "250" : tokens[3],
                    tokens[4].equals("null") ? "10" : tokens[4])
                .toArray(new String[0]);
            dragons.putIfAbsent(color, new ArrayList<>());
            if (dragons.get(color).contains(name)) {
                dragonStats.put(name,
                        Arrays.stream(stats).map(Integer::parseInt).collect(Collectors.toList()));
            } else {
                dragons.get(color).add(name);
                dragonStats.putIfAbsent(key,
                        Arrays.stream(stats).map(Integer::parseInt).collect(Collectors.toList()));
            }
            colorsCount.put(color, colorsCount.containsKey(color) ? colorsCount.get(color) + 1 : 1);
            colorMeanStats.putIfAbsent(color, new ArrayList() {{ add(0.0); add(0.0); add(0.0);}});
            colorMeanStats.get(color).set(0,
                    colorMeanStats.get(color).get(0) + (tokens[2].equals("null") ? 45 : Double.parseDouble(tokens[2])));
            colorMeanStats.get(color).set(1,
                    colorMeanStats.get(color).get(1) + (tokens[3].equals("null") ? 250 : Double.parseDouble(tokens[3])));
            colorMeanStats.get(color).set(2,
                    colorMeanStats.get(color).get(2) + (tokens[4].equals("null") ? 10.0 : Double.parseDouble(tokens[4])));
        }

        dragons.forEach((key, value) -> value.sort(String::compareTo));


        for (Map.Entry<String, List<String>> dragon : dragons.entrySet()) {
            List<Double> meanStats = colorMeanStats.get(dragon.getKey());
            Integer colorCount = colorsCount.get(dragon.getKey());
            for (int i = 0; i < meanStats.size(); i++) {
                meanStats.set(i, meanStats.get(i) / colorCount);
            }

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",
                    dragon.getKey(), meanStats.get(0), meanStats.get(1), meanStats.get(2));
            dragon.getValue().forEach(name -> {
                List<Integer> stats = dragonStats.get(dragon.getKey() + "::" + name);
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        name, stats.get(0), stats.get(1), stats.get(2));
            });
        }
    }
}

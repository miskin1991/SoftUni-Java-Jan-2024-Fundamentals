package ExercisesMore.MapsExerciseMore;

import java.util.*;

public class _05_DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, List<Double>>> dragons = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String[] stats = scanner.nextLine().split(" ");
            dragons.putIfAbsent(stats[0], new TreeMap<>());
            Double damage = getParsedOrDefault(stats[2], 45.0);
            Double health = getParsedOrDefault(stats[3], 250.0);
            Double armor = getParsedOrDefault(stats[4], 10.0);
            dragons.get(stats[0]).put(stats[1], new ArrayList() {{
               add(damage); add(health); add(armor);
            }});
        }

        dragons.forEach((key1, value1) -> {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",key1,
                    value1.values().stream()
                            .map(doubles -> doubles.get(0)).mapToDouble(Double::doubleValue).average().orElse(0.0),
                    value1.values().stream()
                            .map(doubles -> doubles.get(1)).mapToDouble(Double::doubleValue).average().orElse(0.0),
                    value1.values().stream()
                            .map(doubles -> doubles.get(2)).mapToDouble(Double::doubleValue).average().orElse(0.0));
            value1.forEach((key,value) -> {
                System.out.printf("-%s -> damage: %.0f, health: %.0f, armor: %.0f%n"
                        , key, value.get(0), value.get(1), value.get(2));
            });
        });
    }

    public static Double getParsedOrDefault(String value, Double orDefault) {
        if (value.equals("null")) return orDefault;
        else return Double.parseDouble(value);
    }
}

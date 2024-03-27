package ExercisesMore.MapsExerciseMore;

import java.util.*;

public class _05_DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, TreeMap<String, String>> dragons = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String[] stats = scanner.nextLine().split(" ");
            dragons.putIfAbsent(stats[0], new TreeMap<>());
            dragons.get(stats[0]).put(stats[1],
                    (stats[2].compareTo("null") == 0 ? "45" : stats[2]) + " " +
                    (stats[3].compareTo("null") == 0 ? "250" : stats[3]) + " " +
                    (stats[4].compareTo("null") == 0 ? "10" : stats[4])
            );
        }

        LinkedHashMap<String, List<Double>> statsMeans = new LinkedHashMap<>();
        dragons.forEach((color, dragon) -> {
            statsMeans.put(color, new ArrayList(){{ add(0.0); add(0.0); add(0.0); }});
            List<Double> statsMeansByColor = statsMeans.get(color);
            dragon.forEach((name, stats) -> {
                int damage = Integer.parseInt(stats.split(" ")[0]);
                int health = Integer.parseInt(stats.split(" ")[1]);
                int armor = Integer.parseInt(stats.split(" ")[2]);
                statsMeansByColor.set(0, statsMeansByColor.get(0) + damage);
                statsMeansByColor.set(1, statsMeansByColor.get(1) + health);
                statsMeansByColor.set(2, statsMeansByColor.get(2) + armor);
            });
            statsMeansByColor.set(0, statsMeansByColor.get(0) / dragon.size());
            statsMeansByColor.set(1, statsMeansByColor.get(1) / dragon.size());
            statsMeansByColor.set(2, statsMeansByColor.get(2) / dragon.size());
        });

        dragons.forEach((color, dragon) -> {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", color,
                    statsMeans.get(color).get(0),
                    statsMeans.get(color).get(1),
                    statsMeans.get(color).get(2));
            dragon.forEach((name, stats) -> {
                String[] statsTokens = stats.split(" ");
                System.out.printf("-%s -> damage: %s, health: %s, armor: %s%n",
                        name, statsTokens[0], statsTokens[1], statsTokens[2]);
            });
        });
    }
}

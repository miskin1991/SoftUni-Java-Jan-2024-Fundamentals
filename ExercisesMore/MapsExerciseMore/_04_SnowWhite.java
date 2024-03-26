package ExercisesMore.MapsExerciseMore;

import java.util.*;

public class _04_SnowWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> dwarfsInfo = new LinkedHashMap<>();
        while(!input.equals("Once upon a time")) {
            String[] tokens = input.split(" <:> ");
            String dwarf = String.format("(%s) %s <->", tokens[1], tokens[0]);
            int physics = Integer.parseInt(tokens[2]);
            dwarfsInfo.putIfAbsent(dwarf, physics);
            if (dwarfsInfo.get(dwarf) < physics)
                dwarfsInfo.put(dwarf, physics);
            input = scanner.nextLine();
        }

        Map<String, Integer> countColors = new HashMap<>();
        dwarfsInfo.forEach((key, value) -> {
            String color = key.split(" ")[0];
            countColors.put(color, countColors.containsKey(color) ? countColors.get(color) + 1 : 1);
        });

        dwarfsInfo.entrySet().stream().
                sorted((o1, o2) -> {
                   int sort = o2.getValue() - o1.getValue();
                   if (sort == 0) {
                       String colorO1 = o1.getKey().split(" ")[0];
                       String colorO2 = o2.getKey().split(" ")[0];
                       sort = countColors.get(colorO2) - countColors.get(colorO1);
                   }
                   return  sort;
                }).forEach(dwarf -> {System.out.printf("%s %d%n", dwarf.getKey(), dwarf.getValue());});
    }
}

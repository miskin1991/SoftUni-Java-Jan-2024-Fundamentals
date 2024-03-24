package ExercisesMore.MapsExerciseMore;

import java.util.*;

public class _04_SnowWhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> dwarfs = new LinkedHashMap<>();
        // we start populating the dwarfs map ordered by <Hat<Name, Physic>>
        while (!input.equals("Once upon a time")) {
            String[] tokens = input.split(" <:> ");
            String name = tokens[0];
            String color = tokens[1];
            int physics = Integer.parseInt(tokens[2]);
            if (dwarfs.containsKey(color)) {
                if (dwarfs.get(color).containsKey(name)) {
                    int currentPhysics = dwarfs.get(color).get(name);
                    if (currentPhysics < physics) {
                        dwarfs.get(color).put(name, physics);
                    }
                } else {
                    dwarfs.get(color).put(name, physics);
                }
            } else {
                dwarfs.put(color, new LinkedHashMap<>());
                dwarfs.get(color).put(name, physics);
            }
            input = scanner.nextLine();
        }

        // We order each Color SubMap by Physics in descendant order
        for(Map.Entry<String, LinkedHashMap<String, Integer>> color : dwarfs.entrySet()) {
            orderMapByValueDescendant(color.getValue());
        }

        // We create a TreeMap to order the dwarfs by Physics in ascendant order <Physics<Color, List<Names>>
        TreeMap<Integer, LinkedHashMap<String, List<String>>> dwarfsByPhysics = new TreeMap<>();
        for(Map.Entry<String, LinkedHashMap<String, Integer>> color : dwarfs.entrySet()) {
            for (Map.Entry<String, Integer> dwarf : color.getValue().entrySet()) {
                Integer physics = dwarf.getValue();
                String hat = color.getKey();
                String name = dwarf.getKey();
                dwarfsByPhysics.putIfAbsent(physics, new LinkedHashMap<>());
                dwarfsByPhysics.get(physics).putIfAbsent(hat, new ArrayList<>());
                dwarfsByPhysics.get(physics).get(hat).add(name);
            }
        }

        // We get the list of keys, so we can reverse in descendant order
        List<Integer> keys = new ArrayList<>(dwarfsByPhysics.keySet());
        Collections.reverse(keys);
        orderMapByValueSize(dwarfsByPhysics);
        // Print Physics by Physics each HatColor the dwarfs Name
        for (Integer key : keys) {
            for (Map.Entry<String, List<String>> color : dwarfsByPhysics.get(key).entrySet()) {
                for (String name : color.getValue()) {
                    System.out.printf("(%s) %s <-> %s%n", color.getKey(), name, key);
                }
            }
        }
    }

    private static void orderMapByValueDescendant(LinkedHashMap<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        map.clear();
        getSortedDescendant(list);
        for (Map.Entry<String, Integer> element : list) {
            map.put(element.getKey(), element.getValue());
        }
    }

    private static void getSortedDescendant(List<Map.Entry<String, Integer>> list) {
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
    }

    private static void orderMapByValueSize(TreeMap<Integer, LinkedHashMap<String, List<String>>> map) {
        for (Map.Entry<Integer, LinkedHashMap<String, List<String>>> mapElement : map.entrySet()) {
            List<Map.Entry<String, List<String>>> list = new ArrayList<>(mapElement.getValue().entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, List<String>>>() {
                        @Override
                        public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                            return o2.getValue().size() - o1.getValue().size();
                        }
            });
            LinkedHashMap<String, List<String>> ordered = new LinkedHashMap<>(list.size());
            for (Map.Entry<String, List<String>> element : list) {
                ordered.put(element.getKey(), element.getValue());
            }
            mapElement.setValue(ordered);
        }
    }
}

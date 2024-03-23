package Labs.MapsLab;

import java.util.*;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> occurrences = new LinkedHashMap<>();

        for(String word : words) {
            word = word.toLowerCase();
            occurrences.putIfAbsent(word, 0);
            occurrences.put(word, occurrences.get(word) + 1);
        }

        ArrayList<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> occurrence : occurrences.entrySet()) {
            if(occurrence.getValue() % 2 == 1) {
                odds.add(occurrence.getKey());
            }
        }

        System.out.println(odds.toString().replaceAll("[\\[\\]]", ""));
    }
}

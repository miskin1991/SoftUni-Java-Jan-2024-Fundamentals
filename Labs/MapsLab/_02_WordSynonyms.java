package Labs.MapsLab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordCount = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < wordCount; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            if (words.containsKey(key)) {
                words.get(key).add(value);
            } else {
                ArrayList<String> synonyms = new ArrayList<>();
                synonyms.add(value);
                words.put(key, synonyms);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry: words.entrySet()) {
            System.out.printf("%s - ", entry.getKey());
            System.out.printf("%s", entry.getValue().toString().replaceAll("[\\[\\]]", ""));
            System.out.println();
        }
    }
}

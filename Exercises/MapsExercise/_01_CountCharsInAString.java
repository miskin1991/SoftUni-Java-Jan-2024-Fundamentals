package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consoleEntry = scanner.nextLine();

        LinkedHashMap<Character, Integer> characters = new LinkedHashMap<>();
        for (char symbol : consoleEntry.toCharArray()) {
            if (symbol == ' ') continue;
            characters.putIfAbsent(symbol, 0);
            characters.put(symbol, characters.get(symbol) + 1);
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

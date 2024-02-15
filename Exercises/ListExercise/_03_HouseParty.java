package Exercises.ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entries = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        while(entries > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            if (tokens.length > 3) {
                // is not going
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                // is going
                if (names.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    names.add(name);
                }
            }
            entries--;
        }
        for (String name : names) System.out.println(name);
    }
}

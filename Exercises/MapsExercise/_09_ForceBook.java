package Exercises.MapsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, ArrayList<String>> forceBook = new LinkedHashMap<>();
        while(!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];
                if (!isUserFound(forceBook, user)) {
                    addUser(forceBook, side, user);
                }
            } else if (input.contains(" -> ")) {
                String user = input.split(" -> ")[0];
                String side = input.split(" -> ")[1];
                removeUser(forceBook, user);
                addUser(forceBook, side, user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> forceSide : forceBook.entrySet()) {
            if (!forceSide.getValue().isEmpty()) {
                System.out.printf("Side: %s, Members: %d%n", forceSide.getKey(), forceSide.getValue().size());
                for (String user : forceSide.getValue()) {
                    System.out.printf("! %s%n", user);
                }
            }
        }
    }

    private static void removeUser(LinkedHashMap<String, ArrayList<String>> forceBook, String user) {
        if (isUserFound(forceBook, user)) {
            for (Map.Entry<String, ArrayList<String>> forceSide : forceBook.entrySet()) {
                if (forceSide.getValue().contains(user)) {
                    forceSide.getValue().remove(user);
                    break;
                }
            }
        }
    }

    private static void addUser(LinkedHashMap<String, ArrayList<String>> forceBook, String side, String user) {
        if (forceBook.containsKey(side)) {
            forceBook.get(side).add(user);
        } else {
            forceBook.put(side, new ArrayList<>());
            forceBook.get(side).add(user);
        }
    }

    private static boolean isUserFound(LinkedHashMap<String, ArrayList<String>> forceBook, String user) {
        boolean userFound = false;
        for (Map.Entry<String, ArrayList<String>> forceSide : forceBook.entrySet()) {
            if (forceSide.getValue().contains(user)) {
                userFound = true;
                break;
            }
        }
        return userFound;
    }
}

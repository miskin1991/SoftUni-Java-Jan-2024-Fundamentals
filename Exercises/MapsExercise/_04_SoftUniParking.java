package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int entries = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> parkingLot = new LinkedHashMap<>();
        for (int i = 0; i < entries; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String action = tokens[0];
            String username = tokens[1];
            if (action.equals("unregister")) {
                if (parkingLot.containsKey(username)) {
                    parkingLot.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            } else {
                if (parkingLot.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", parkingLot.get(username));
                } else {
                    String plate = tokens[2];
                    System.out.printf("%s registered %s successfully%n", username, plate);
                    parkingLot.put(username, plate);
                }
            }
        }

        for (Map.Entry<String, String> entry : parkingLot.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}

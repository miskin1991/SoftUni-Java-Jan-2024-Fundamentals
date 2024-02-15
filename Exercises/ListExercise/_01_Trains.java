package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPassengersPerWagon = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("Add")) {
                wagons.add(Integer.parseInt(tokens[1]));
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size() && passengers > 0; i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengers <= maxPassengersPerWagon) {
                        currentWagon += passengers;
                        passengers -= passengers;
                        wagons.set(i, currentWagon);
                    } else {
                        currentWagon = wagons.get(i);
                        boolean canFit = ((maxPassengersPerWagon - currentWagon - passengers) >= 0);
                        if (canFit) {
                            wagons.set(i, currentWagon + passengers);
                            passengers = 0;
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}

package Exercises.ObjectsAndClassesExercise._05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End") && !input.equals("Close the Catalogue")) {
            String[] tokens = input.split(" ");
            vehicles.add(new Vehicle(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            input = scanner.nextLine();
            while (!input.equals("Close the Catalogue")) {
                String finalInput = input;
                vehicles.stream()
                        .filter(v -> v.getModel().equals(finalInput))
                        .findFirst().ifPresent(Vehicle::printVehicleData);
                input = scanner.nextLine();
            }
        }

        printAverage(vehicles, "Car");
        printAverage(vehicles, "Truck");
    }

    private static void printAverage(List<Vehicle> vehicles, String type) {
        List<Vehicle> sublist = vehicles.stream()
                .filter(vehicle -> vehicle.getType().equals(type))
                .collect(Collectors.toList());
        float average = 0.0f;
        for (Vehicle vehicle : sublist) {
            average += vehicle.getHp();
        }
        if(sublist.isEmpty()) {
            System.out.printf("%ss have average horsepower of: %.2f.%n", type, 0.0f);
        } else {
            System.out.printf("%ss have average horsepower of: %.2f.%n", type, average / sublist.size());
        }
    }
}

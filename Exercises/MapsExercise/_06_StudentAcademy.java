package Exercises.MapsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<Double>> agenda = new LinkedHashMap<>();
        int entries = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < entries; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            agenda.putIfAbsent(name, new ArrayList<>());
            agenda.get(name).add(grade);
        }
        
        for (Map.Entry<String, ArrayList<Double>> entry : agenda.entrySet()) {
            double average = 0.0;
            for (double grade : entry.getValue()) {
                average += grade;
            }
            average /= entry.getValue().size();
            if (average >= 4.50) System.out.printf("%s -> %.2f%n", entry.getKey(), average);
        }
    }
}

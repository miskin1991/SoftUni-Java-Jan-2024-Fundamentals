package Exercises.MapsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> register = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];
            register.putIfAbsent(course, new ArrayList<>());
            register.get(course).add(student);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : register.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (String student : entry.getValue()) {
                System.out.printf("-- %s%n", student);
            }
        }
    }
}

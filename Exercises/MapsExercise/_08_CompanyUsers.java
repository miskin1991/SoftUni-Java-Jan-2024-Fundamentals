package Exercises.MapsExercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> employees = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split(" -> ");
            String name = tokens[0];
            String id = tokens[1];
            if (employees.containsKey(name)) {
                if (!employees.get(name).contains(id)) employees.get(name).add(id);
            } else {
                employees.put(name, new ArrayList<>());
                employees.get(name).add(id);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : employees.entrySet()) {
            System.out.println(entry.getKey());
            for (String element : entry.getValue()) {
                System.out.printf("-- %s%n", element);
            }
        }
    }
}

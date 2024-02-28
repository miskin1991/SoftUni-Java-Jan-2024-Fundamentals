package Exercises.ObjectsAndClassesExercise._06_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> persons = new ArrayList<>();

        while (!input.equals("End")) {
            String[] person = input.split(" ");
            persons.add(new Person(person[0], person[1], Integer.parseInt(person[2])));
            input = scanner.nextLine();
        }

        persons.sort(Comparator.comparing(Person::getAge));

        for (Person person : persons) person.printPersonData();
    }
}

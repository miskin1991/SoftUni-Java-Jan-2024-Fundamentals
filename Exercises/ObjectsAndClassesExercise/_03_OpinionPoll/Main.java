package Exercises.ObjectsAndClassesExercise._03_OpinionPoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] person = scanner.nextLine().split(" ");
            persons[i] = new Person(person[0], Integer.parseInt(person[1]));
        }
        for (Person person : persons) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }
    }
}

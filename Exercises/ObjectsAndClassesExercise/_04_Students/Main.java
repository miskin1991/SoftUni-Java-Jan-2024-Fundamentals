package Exercises.ObjectsAndClassesExercise._04_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] student = scanner.nextLine().split(" ");
            students.add(new Student(student[0], student[1], Float.parseFloat(student[2])));
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) System.out.println(student);
    }
}

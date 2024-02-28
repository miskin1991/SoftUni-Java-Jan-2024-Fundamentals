package Labs.ObjectsAndClasses._06_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] info = input.split(" ");
            Student student = getStudent(students, info[0], info[1]);
            if (student == null) {
                students.add(new Student(info[0], info[1], Integer.parseInt(info[2]), info[3]));
            } else {
                student.setAge(Integer.parseInt(info[2]));
                student.setHometown(info[3]);
            }
            input = scanner.nextLine();
        }

        String city = scanner.nextLine();

        List<Student> filteredStudents = students.stream().filter(student -> student.getHometown().equals(city))
                .collect(Collectors.toList());
        for (Student student : filteredStudents) {
            System.out.printf("%s %s is %d years old%n",
                    student.getName(), student.getSurname(), student.getAge());
        }
    }

    public static Student getStudent(List<Student> students, String name, String surname) {
        return students.stream()
                .filter(student -> Objects.equals(student.getName(), name) && student.getSurname().equals(surname))
                .findFirst().orElse(null);
    }
}

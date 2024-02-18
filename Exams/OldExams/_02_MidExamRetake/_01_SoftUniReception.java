package Exams.OldExams._02_MidExamRetake;

import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] employees = new int[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = Integer.parseInt(scanner.nextLine());
        }
        int students = Integer.parseInt(scanner.nextLine());

        int hours = 0;
        while (students > 0) {
            for (int amount : employees) students -= amount;
            hours++;
            if (hours % 4 == 0) hours++;
        }
        System.out.println("Time needed: " + hours + "h.");
    }
}

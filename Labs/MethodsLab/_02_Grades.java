package Labs.MethodsLab;

import java.util.Scanner;

public class _02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float grade = Float.parseFloat(scanner.nextLine());
        System.out.println(gradeInString(grade));
    }

    private static String gradeInString(float grade) {
        if (grade >= 2.00 && grade < 3.00) return "Fail";
        else if (grade >= 3.00 && grade < 3.50) return "Poor";
        else if (grade >= 3.50 && grade < 4.50) return "Good";
        else if (grade >= 4.50 && grade < 5.50) return "Very good";
        else if (grade >= 5.50 && grade <= 6.00) return "Excellent";
        else return "Invalid grade";
    }
}

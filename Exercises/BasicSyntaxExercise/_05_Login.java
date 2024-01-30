package Exercises.BasicSyntaxExercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        int attempt = 0;
        String pass = scanner.nextLine();
        while (!pass.equals(password)) {
            attempt++;
            if (attempt < 4) {
                System.out.printf("Incorrect password. Try again.%n");
            } else {
                System.out.printf("User %s blocked!", username);
                return;
            }
            pass = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
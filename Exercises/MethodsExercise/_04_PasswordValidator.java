package Exercises.MethodsExercise;

import java.util.Scanner;

public class _04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (isValidPassword(password)) System.out.println("Password is valid");
    }

    private static boolean isValidPassword(String password) {
        boolean isLengthValid = validLength(password);
        if(!isLengthValid) System.out.println("Password must be between 6 and 10 characters");
        boolean areCharsValid = isOnlyLettersOrDigits(password);
        if(!areCharsValid) System.out.println("Password must consist only of letters and digits");
        boolean hasTwoDigits = atLeastTwoDigits(password);
        if(!hasTwoDigits) System.out.println("Password must have at least 2 digits");

        return isLengthValid && areCharsValid && hasTwoDigits;
    }

    private static boolean validLength(String password){
        return ((password.length() >= 6) && (password.length() <= 10));
    }

    private static boolean isOnlyLettersOrDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!((symbol >= '0' && symbol <= '9')
                || (symbol >= 'A' && symbol <= 'Z')
                || (symbol >= 'a' && symbol <= 'z')) ){
                return false;
            }
        }
        return true;
    }

    private static boolean atLeastTwoDigits(String password) {
        byte counter = 0;
        for (int i = 0; (i < password.length()) && (counter < 2); i++) {
            char symbol = password.charAt(i);
            if (symbol >= '0' && symbol <= '9')
                counter++;
        }

        return (counter >= 2);
    }
}

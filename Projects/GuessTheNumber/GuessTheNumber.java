package Projects.GuessTheNumber;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private static int attempts = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean isFound = false;

        System.out.println("Welcome to the Guess the Number game.");
        System.out.println("Please start providing your guesses here");

        int number = Integer.parseInt(scanner.nextLine());
        while(attempts > 0) {
            if (number == randomNumber) {
                System.out.println("Congrats! You found the number: " + number);
                return;
            } else if ( number < randomNumber) {
                System.out.println("Please try again, it is bigger");
            } else {
                System.out.println("Please try again, it is lower");
            }
            attempts--;
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sorry, you lost as the number was " + randomNumber);
    }
}

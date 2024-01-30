package Projects.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class RockPaperScissors {
    private static int mPoints = 3;
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    /**
     * Method to parse the computer choice from an integer input
     * @param choice: computer's choice as integer parameter
     * @return String containing the internal game choice
     */
    private static String parseChoiceByInteger(int choice) {
        String selection = "";
        switch (choice) {
            case 0:
                selection = parseChoiceByString("r");
                break;
            case 1:
                selection = parseChoiceByString("p");
                break;
            case 2:
                selection = parseChoiceByString("s");
                break;
            default:
                System.out.println("Invalid Input from computer. Restart the game...");
                exit(1);
        }
        return selection;
    }

    /**
     * Method to parse the user choice from a String input
     * @param choice: user's choice as String parameter
     * @return String containing the internal game choice
     */
    private static String parseChoiceByString(String choice) {
        String selection = "";
        switch (choice) {
            case "r":
            case "rock":
                selection = ROCK;
                break;
            case "p":
            case "paper":
                selection = PAPER;
                break;
            case "s":
            case "scissors":
                selection = SCISSORS;
                break;
            default:
                System.out.println("Invalid Input from user. Restart the game...");
                exit(1);
        }
        return  selection;
    }

    /**
     * Method to run the game action
     */
    private static void Run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
        String userSelection = scanner.nextLine().toLowerCase();
        userSelection = parseChoiceByString(userSelection);
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        String computerSelection = parseChoiceByInteger(randomNumber);
        System.out.println("The computer chose " + computerSelection);
        if (userSelection.equals(computerSelection)) {
            System.out.println("Draw");
        } else if ((userSelection.equals(ROCK) && computerSelection.equals(SCISSORS))
                || (userSelection.equals(PAPER) && computerSelection.equals(ROCK))
                || (userSelection.equals(SCISSORS) && computerSelection.equals(PAPER))) {
            System.out.println("You win");
            mPoints++;
        } else {
            System.out.println("You lose");
            mPoints--;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("END")) {
            Run();
            if (mPoints > 0) {
                System.out.println("Do you want to play another game? Type END otherwise.");
                input = scanner.nextLine();
            } else {
                System.out.println("You are out of points. Game over!");
            }
        }
    }
}

package BasicSyntaxExerciseMore;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = Double.parseDouble(scanner.nextLine());
        double balanceCopy = balance;

        String command = scanner.nextLine();
        while (!command.equals("Game Time")) {
            balance = buyGame(balance, command);
            if (balance == 0.0) {
                System.out.println("Out of money!");
                return;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", (balanceCopy - balance), balance);
    }

    /**
     * Method to purchase a game.
     * @param balance: the current client money balance.
     * @param gameName: the game to purchase.
     * @return the remaining client balance.
     */
    private static double buyGame(double balance, String gameName) {
        boolean bought = false;
        boolean found = false;
        switch (gameName) {
            case "OutFall 4":
                if (balance - 39.99 >= 0) {
                    balance -= 39.99;
                    bought = true;
                }
                found = true;
                break;
            case "CS: OG":
                if (balance - 15.99 >= 0) {
                    balance -= 15.99;
                    bought = true;
                }
                found = true;
                break;
            case "Zplinter Zell":
                if (balance - 19.99 >= 0) {
                    balance -= 19.99;
                    bought = true;
                }
                found = true;
                break;
            case "Honored 2":
                if (balance - 59.99 >= 0) {
                    balance -= 59.99;
                    bought = true;
                }
                found = true;
                break;
            case "RoverWatch":
                if (balance - 29.99 >= 0) {
                    balance -= 29.99;
                    bought = true;
                }
                found = true;
                break;
            case "RoverWatch Origins Edition":
                if (balance - 39.99 >= 0) {
                    balance -= 39.99;
                    bought = true;
                }
                found = true;
                break;
            default:
                System.out.println("Not Found");
                break;
        }
        if (bought) System.out.println("Bought " + gameName);
        if (found && !bought) System.out.println("Too Expensive");
        return balance;
    }
}
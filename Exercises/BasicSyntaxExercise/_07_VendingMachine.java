package Exercises.BasicSyntaxExercise;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        double money = 0.0;

        while (!action.equals("Start")) {
            double coin = Double.parseDouble(action);
            if (coin == 0.1) {
                money += 0.1;
            } else if (coin == 0.2) {
                money += 0.2;
            } else if (coin == 0.5) {
                money += 0.5;
            } else if (coin == 1.0) {
                money += 1.0;
            } else if (coin == 2.0) {
                money += 2.0;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            action = scanner.nextLine();
        }

        money = doVending(money, scanner);

        System.out.printf("Change: %.2f%n", money);
    }

    /**
     * Method to run the vending logic until end command is given.
     * @param money: money available for purchases.
     * @param scanner: scan input data.
     * @return remaining money.
     */
    private  static double doVending(double money, Scanner scanner) {
        String action = scanner.nextLine();
        while (!action.equals("End")) {
            switch (action) {
                case "Nuts":
                    money = chargePrice(money, 2.0, action);
                    break;
                case "Water":
                    money = chargePrice(money, 0.7, action);
                    break;
                case "Crisps":
                    money = chargePrice(money, 1.5, action);
                    break;
                case "Soda":
                    money = chargePrice(money, 0.8, action);
                    break;
                case "Coke":
                    money = chargePrice(money, 1.0, action);
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            action = scanner.nextLine();
        }
        return money;
    }

    /**
     * Method to try to perform a purchase.
     * @param money: available money for product purchase.
     * @param price: product price.
     * @param product: product name.
     * @return remaining money.
     */
    private static double chargePrice(double money, double price, String product) {
        if ((money - price) >= 0.0) {
            money -= price;
            System.out.println("Purchased " + product);
        } else {
            System.out.println("Sorry, not enough money");
        }
        return money;
    }
}
package Exercises.BasicSyntaxExercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double price = getPrice(day, type);

        double totalPrice = price * number;

        if (type.equals("students") && number >= 30) {
            totalPrice *= 0.85;
        } else if (type.equals("business") && number >= 100) {
            totalPrice -= price * 10;
        } else if (type.equals("regular") && number >= 10 && number <= 20) {
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }

    private static double getPrice(String day, String type) {
        double price;

        if (day.equals("friday")) {
            if (type.equals(("students"))) {
                price = 8.45;
            } else if (type.equals("business")) {
                price = 10.90;
            } else {
                price = 15.00;
            }
        } else if (day.equals("saturday")) {
            if (type.equals(("students"))) {
                price = 9.80;
            } else if (type.equals("business")) {
                price = 15.60;
            } else {
                price = 20.00;
            }
        } else {
            if (type.equals(("students"))) {
                price = 10.46;
            } else if (type.equals("business")) {
                price = 16.00;
            } else {
                price = 22.50;
            }
        }
        return price;
    }
}
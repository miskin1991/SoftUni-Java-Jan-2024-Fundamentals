package Exams.OldExams._01_MidExamRetake;

import java.util.Scanner;

public class _01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        double totalNoTaxes = 0.0;
        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0.0) {
                System.out.println("Invalid price!");
            } else {
                totalNoTaxes += price;
            }
            command = scanner.nextLine();
        }
        if (totalNoTaxes > 0.0) {
            double totalTaxes = totalNoTaxes * 0.20;
            double toPay = totalNoTaxes + totalTaxes;
            if (command.equals("special")) {
                toPay *= 0.90;
            }
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalNoTaxes);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", toPay);
        } else System.out.println("Invalid order!");
    }
}

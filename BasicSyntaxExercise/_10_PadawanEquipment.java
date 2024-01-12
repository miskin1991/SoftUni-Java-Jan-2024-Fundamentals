package BasicSyntaxExercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        double totalPrice = Math.ceil(students * 1.10) * priceLightsaber;
        totalPrice += students * priceRobe;
        int freeBelts = students / 6;
        totalPrice += (students - freeBelts) * priceBelt;

        if (totalPrice > money) {
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - money);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }
    }
}
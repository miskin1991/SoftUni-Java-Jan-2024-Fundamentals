package Labs.MethodsLab;

import java.util.Scanner;

public class _05_Orders {
    private static final float COFFEE = 1.50F;
    private static final float WATER = 1.00F;
    private static final float COKE = 1.40F;
    private static final float SNACKS = 2.00F;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        getTotalPrice(product, amount);
    }

    private static void getTotalPrice(String product, int amount) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", amount * COFFEE);
                break;
            case "water":
                System.out.printf("%.2f", amount * WATER);
                break;
            case "coke":
                System.out.printf("%.2f", amount * COKE);
                break;
            case "snacks":
                System.out.printf("%.2f", amount * SNACKS);
                break;
            default:
                System.out.println("Invalid product");
                break;
        }
    }
}

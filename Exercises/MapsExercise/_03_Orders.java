package Exercises.MapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> productsPrices = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String[] tokens = input.split(" ");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (productsPrices.containsKey(product)) {
                if (productsPrices.get(product) != price) {
                    productsPrices.put(product, price);
                }
            } else {
                productsPrices.put(product, price);
            }

            if (productsQuantity.containsKey(product)) {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            } else {
                productsQuantity.put(product, quantity);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> product : productsQuantity.entrySet()) {
            double totalPrice = product.getValue() * productsPrices.get(product.getKey());
            System.out.printf("%s -> %.2f%n", product.getKey(), totalPrice);
        }
    }

}

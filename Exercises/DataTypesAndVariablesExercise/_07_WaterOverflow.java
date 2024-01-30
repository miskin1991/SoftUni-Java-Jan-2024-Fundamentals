package Exercises.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short maximum = 255;
        short input = Short.parseShort(scanner.nextLine());
        short quantity = 0;
        for (int i = 0; i < input; i++) {
            short litres = Short.parseShort(scanner.nextLine());
            if (quantity + litres > maximum) {
                System.out.println("Insufficient capacity!");
            } else {
                quantity += litres;
            }
        }

        System.out.println(quantity);
    }
}

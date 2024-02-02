package Exercises.ArraysExercise;

import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[n];

        int passangers = 0;
        for (int i = 0; i < wagons.length; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());
            passangers += wagons[i];
        }

        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
        System.out.printf("%n%d", passangers);

    }
}

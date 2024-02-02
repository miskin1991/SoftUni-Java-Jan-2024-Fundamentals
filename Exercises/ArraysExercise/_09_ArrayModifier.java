package Exercises.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        while(!input.equalsIgnoreCase("end")) {
            String[] operation = input.split(" ");
            switch (operation[0].toLowerCase()) {
                case "swap": {
                    int idx1 = Integer.parseInt(operation[1]);
                    int idx2 = Integer.parseInt(operation[2]);
                    int aux = array[idx1];
                    array[idx1] = array[idx2];
                    array[idx2] = aux;
                    break;
                }
                case "multiply": {
                    int idx1 = Integer.parseInt(operation[1]);
                    int idx2 = Integer.parseInt(operation[2]);
                    array[idx1] = array[idx1] * array[idx2];
                    break;
                }
                default:
                    for (int i = 0; i < array.length; i++) {
                        array[i]--;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println(array[array.length - 1]);
    }
}

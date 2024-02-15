package Exercises.ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> specials = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while(list.contains(specials.get(0))) {
            int index = list.indexOf(specials.get(0));
            int shift = specials.get(1);
            int indexToRemove = index - shift;
            int numsOfElementsToRemove = shift + 1 + shift;
            if (indexToRemove < 0) {
                numsOfElementsToRemove += indexToRemove;
                indexToRemove = 0;
            }
            for (; numsOfElementsToRemove > 0 && indexToRemove < list.size(); numsOfElementsToRemove--) {
                list.remove(indexToRemove);
            }
        }
        int sum = 0;
        for (int element : list) sum += element;
        System.out.println(sum);
    }
}

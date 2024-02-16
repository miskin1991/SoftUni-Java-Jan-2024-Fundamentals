package ExercisesMore.ListsExerciseMore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> race = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        double player1 = calculateTime(race.subList(0, race.size() / 2), false);
        double player2 = calculateTime(race.subList((race.size() / 2) + 1, race.size()), true);
        if (player1 < player2)
            System.out.printf("The winner is left with total time: %.1f", player1);
        else
            System.out.printf("The winner is right with total time: %.1f", player2);
    }

    private static double calculateTime(List<Integer> list, boolean reverse) {
        double sum = 0;

        if (reverse) Collections.reverse(list);

        for (int element : list) {
            sum += element;
            if (element == 0) sum *= 0.80;
        }

        return  sum;
    }
}

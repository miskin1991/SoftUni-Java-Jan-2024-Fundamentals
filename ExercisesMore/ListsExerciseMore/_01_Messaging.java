package ExercisesMore.ListsExerciseMore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String message = scanner.nextLine();
        String output = "";
        for (int element : list) {
            int number = getNumber(element);
            while (number >= message.length()) number -= message.length();
            output += message.charAt(number);
            message = message.substring(0, number) + message.substring(number + 1);
        }
        System.out.println(output);
    }

    private static int getNumber(int number) {
        int result = 0;
        while(number / 10 != 0) {
            result += number % 10;
            number /= 10;
        }
        result += number % 10;
        return result;
    }
}

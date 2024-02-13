package Labs.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while(!command.equals("end")) {
            String[] tokens = command.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    printContainsResult(Integer.parseInt(tokens[1]), list);
                    break;
                case "Print":
                    if(tokens[1].equals("even")) printEven(list);
                    else printOdd(list);
                    break;
                case "Get":
                    printSum(list);
                    break;
                case "Filter":
                    printFilter(tokens[1], tokens[2], list);
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }

    }

    private static void printFilter(String sign, String value, List<Integer> list) {
        int number = Integer.parseInt(value);
        switch (sign) {
            case ">":
                for (int element : list) if (element > number) System.out.printf("%d ", element);
                System.out.println();
                break;
            case ">=":
                for (int element : list) if (element >= number) System.out.printf("%d ", element);
                System.out.println();
                break;
            case "<":
                for (int element : list) if (element < number) System.out.printf("%d ", element);
                System.out.println();
                break;
            case "<=":
                for (int element : list) if (element <= number) System.out.printf("%d ", element);
                System.out.println();
                break;
            default:
                break;
        }
    }

    private static void printSum(List<Integer> list) {
        int sum = 0;
        for (int number : list) sum += number;
        System.out.println(sum);
    }

    private static void printEven(List<Integer> list) {
        for(int number : list) {
            if (number % 2 == 0) System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> list) {
        for(int number : list) {
            if (number % 2 != 0) System.out.printf("%d ", number);
        }
        System.out.println();
    }

    private static void printContainsResult(int number, List<Integer> list) {
        if (list.contains(number)) System.out.println("Yes");
        else System.out.println("No such number");
    }
}

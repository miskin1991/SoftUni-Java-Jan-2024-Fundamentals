package Labs.MethodsLab;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        printSumOfDigits(number);
    }

    private static void printSumOfDigits(String number) {
        if (number.charAt(0) == '-') {
            number = number.substring(1);
        }
        int sumEven = getSumOfEvenNumbers(number);
        int sumOdd = getSumOfOddNumbers(number);
        System.out.println(sumOdd * sumEven);
    }

    private static int getSumOfEvenNumbers(String number) {
        int sumEven = 0;
        for(char symbol : number.toCharArray()) {
            int value = Integer.parseInt(symbol + "");
            if (value % 2 == 0)
                sumEven += value;
        }
        return sumEven;
    }

    private static int getSumOfOddNumbers(String number) {
        int sumOdd = 0;
        for(char symbol : number.toCharArray()) {
            int value = Integer.parseInt(symbol + "");
            if (value % 2 != 0)
                sumOdd += value;
        }
        return sumOdd;
    }
}

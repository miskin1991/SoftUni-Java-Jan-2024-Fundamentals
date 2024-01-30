package Labs.BasicSyntaxLab;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; number > 0; i++) {
            if ( i % 2 == 1) {
                System.out.println(i);
                sum += i;
                number--;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
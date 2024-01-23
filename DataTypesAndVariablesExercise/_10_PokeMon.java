package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = Long.parseLong(scanner.nextLine());
        long copyOfN = N / 2;
        boolean divide = (N % 2L) == 0;
        int M = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());

        int count = 0;
        while (N >= M) {
            N -= M;
            count++;
            if (divide && (N == copyOfN) && (Y > 0)) N /= Y;
        }
        System.out.println(N);
        System.out.println(count);
    }
}

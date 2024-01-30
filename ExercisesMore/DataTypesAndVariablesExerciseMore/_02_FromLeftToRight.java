package ExercisesMore.DataTypesAndVariablesExerciseMore;

import java.util.Scanner;
public class _02_FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (long i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String firstStrNum = line.split(" ")[0];
            String secondStrNum = line.split(" ")[1];
            long firstNum = Long.parseLong(firstStrNum);
            long secondNum = Long.parseLong(secondStrNum);
            int sum = 0;
            if (firstNum > secondNum) {
                for (char c : firstStrNum.toCharArray()) {
                    if ( c == '-') continue;
                    sum += Integer.parseInt(c + "");
                }
            } else {
                for (char c : secondStrNum.toCharArray()) {
                    if ( c == '-') continue;
                    sum += Integer.parseInt(c + "");
                }
            }
            System.out.println(sum);
        }
    }
}

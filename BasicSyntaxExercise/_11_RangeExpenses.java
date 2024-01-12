package BasicSyntaxExercise;

import java.util.Scanner;

public class _11_RangeExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCnt = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses = 0.0;
        int keyboardTrashCnt = 0;

        for (int gamesCnt = 1; gamesCnt <= lostGamesCnt; gamesCnt++) {
            if (gamesCnt % 2 == 0) {
                expenses += headsetPrice;
            }
            if (gamesCnt % 3 == 0) {
                expenses += mousePrice;
            }
            if ((gamesCnt % 3 == 0) && (gamesCnt % 2 == 0)) {
                expenses += keyboardPrice;
                keyboardTrashCnt++;
                if (keyboardTrashCnt % 2 == 0) {
                    expenses += displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
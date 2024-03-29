package Labs.BasicSyntaxLab;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;
        if (minutes > 59) {
            minutes -= 60;
            hours++;
        }
        if (hours > 23) {
            hours -= 24;
        }

        if (minutes < 9) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
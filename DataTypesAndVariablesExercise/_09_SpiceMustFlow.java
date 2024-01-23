package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int extracted = 0;
        while(yield >= 100) {
            days++;
            extracted += yield - 26;
            yield -= 10;
        }
        if (extracted > 26) extracted -= 26; // we move out
        System.out.println(days);
        System.out.println(extracted);
    }
}

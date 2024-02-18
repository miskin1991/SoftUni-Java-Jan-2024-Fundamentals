package Exams.OldExams._01_MidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class _02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < wagons.length; i++) {
            while(wagons[i] < 4 && people > 0) {
                wagons[i]++;
                people--;
            }
        }

        if (people > 0)
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        if(wagons[wagons.length - 1] < 4)
            System.out.printf("The lift has empty spots!%n");
        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
    }
}

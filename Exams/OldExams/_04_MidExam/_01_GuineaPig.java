package Exams.OldExams._04_MidExam;

import java.util.Scanner;

public class _01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double pigWeight = Double.parseDouble(scanner.nextLine());

        boolean goToShop = false;
        for (int i = 1; i <= 30 && !goToShop; i++) {
            food -= 0.300;
            if (i % 2 == 0) {
                hay -= food * 0.05;
            }
            if (i % 3 == 0) {
                cover -= pigWeight / 3;
            }
            if (food <= 1e-6 || hay <= 1e-6 || cover <= 1e-6)
                goToShop = true;
        }
        if (goToShop) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    food, hay, cover);
            System.out.println();
        }
    }

}

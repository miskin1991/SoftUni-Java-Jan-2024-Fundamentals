package Exercises.ObjectsAndClassesExercise._02_Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            input = scanner.nextLine().split(": ");
            switch (input[0]) {
                case "Edit": {
                    article.Edit(input[1]);
                    break;
                }
                case "ChangeAuthor": {
                    article.ChangeAuthor(input[1]);
                    break;
                }
                case "Rename": {
                    article.Rename(input[1]);
                    break;
                }
                default:
                    break;
            }
        }
        System.out.println(article);
    }
}

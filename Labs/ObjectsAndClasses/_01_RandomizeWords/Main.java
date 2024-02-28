package Labs.ObjectsAndClasses._01_RandomizeWords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Sentence sentence = new Sentence(input);
        for (int i = 0; i < sentence.getRandomWordsCount(); i++) {
            System.out.println(sentence.getRandomWord());
        }
    }
}

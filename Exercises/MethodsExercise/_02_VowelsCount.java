package Exercises.MethodsExercise;

import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(getVowelsCount(word));
    }
    private static int getVowelsCount(String word){
        int count = 0;
        for(char symbol : word.toCharArray()) {
            switch (symbol) {
                case 'a':
                case 'e':
                case 'o':
                case 'u':
                case 'i':
                case 'A':
                case 'E':
                case 'O':
                case 'U':
                case 'I':
                    count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}

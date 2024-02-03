package ExercisesMore.ArrayExerciseMore;

import java.util.Scanner;

public class _01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = scanner.nextLine();

        int[] encryptedWords = new int[n];
        int count = 0;
        for (String name : words) {
            int encryptValue = getEncryptValue(name);
            encryptedWords[count++] = encryptValue;

        }

        bubbleSort(encryptedWords);

        for (int word : encryptedWords) System.out.println(word);
    }

    /**
     * Implementation of the bubble sort algorithm
     * @param encryptedWords: array to sort
     */
    private static void bubbleSort(int[] encryptedWords) {
        for (int j = 0; j < encryptedWords.length; j++)
            for (int i = 0; i < encryptedWords.length - 1; i++)
                if (encryptedWords[i] > encryptedWords[i + 1]) {
                    int aux = encryptedWords[i];
                    encryptedWords[i] = encryptedWords[i + 1];
                    encryptedWords[i + 1] = aux;
                }
    }

    /**
     * Method to retrieve the encrypted word value
     * @param name: name to encrypt
     * @return encrypted value
     */
    private static int getEncryptValue(String name) {
        int encryptValue = 0;
        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);
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
                    encryptValue += (int) symbol * name.length();
                    break;
                default:
                    encryptValue += (int) symbol / name.length();
                    break;
            }
        }
        return encryptValue;
    }
}

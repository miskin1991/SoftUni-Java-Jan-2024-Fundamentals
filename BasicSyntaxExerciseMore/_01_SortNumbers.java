package BasicSyntaxExerciseMore;

import java.util.Scanner;

public class _01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myCollection = new int[3];

        for (int i = 0; i < myCollection.length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            myCollection[i] = number;
        }

        for (int i = 0; i < myCollection.length; i++) {
            for (int j = 0; j < myCollection.length - 1; j++) {
                if (myCollection[j] < myCollection[j + 1]) {
                    int aux = myCollection[j + 1];
                    myCollection[j + 1] = myCollection[j];
                    myCollection[j] = aux;
                }
            }
        }

        for (int i : myCollection) {
            System.out.println(i);
        }
    }
}
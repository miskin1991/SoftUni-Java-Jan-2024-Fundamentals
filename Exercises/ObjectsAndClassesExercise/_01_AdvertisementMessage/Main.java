package Exercises.ObjectsAndClassesExercise._01_AdvertisementMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message = new Message();
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println(message.getMessage());
        }
    }
}

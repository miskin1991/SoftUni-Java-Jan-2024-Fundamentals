package ExercisesMore.ArrayExerciseMore;

import java.util.Arrays;
import java.util.Scanner;

public class _06_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[] field = new int[size];
        int[] initialBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        for (int index : initialBugsIndexes) {
            if ((index >= 0) && (index < field.length)) {
                field[index] = 1;
            }
        }

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            String[] tokens = command.split(" ");
            int position = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int moves = Integer.parseInt(tokens[2]);
            // check position validity and bug inside position
            if (position >= 0 && position < field.length && field[position] == 1)
                moveBug(direction, position, moves, field);
            command = scanner.nextLine();
        }

        for (int segment : field) System.out.printf("%d ", segment);

    }

    private static void moveBug(String direction, int position, int moves, int[] field) {
        field[position] = 0;
        // retrieve next field position
        int nextPosition;
        if (direction.equals("right")) {
            nextPosition = position + moves;
            // check if next position is inside the field
            while(nextPosition >= 0 && nextPosition < field.length && field[nextPosition] == 1) {
                nextPosition += moves;
            }
            if (nextPosition >= 0 && nextPosition < field.length) {
                field[nextPosition] = 1;
            }
        } else if (direction.equals("left")){
            nextPosition = position - moves;
            // check if next position is inside the field
            while(nextPosition >= 0 && nextPosition < field.length && field[nextPosition] == 1) {
                nextPosition -= moves;
            }
            if (nextPosition >= 0 && nextPosition < field.length) {
                field[nextPosition] = 1;
            }
        }
    }
}

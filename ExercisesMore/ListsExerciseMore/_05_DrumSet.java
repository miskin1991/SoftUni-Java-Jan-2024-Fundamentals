package ExercisesMore.ListsExerciseMore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumsSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drumsSetCopy = new ArrayList<>(drumsSet);

        String command = scanner.nextLine();
        while (!command.equals("Hit it again, Gabsy!")) {
            int damage = Integer.parseInt(command);
            for (int i = 0; i < drumsSet.size(); i++) {
                int drum = drumsSet.get(i);
                drum -= damage;
                if (drum <= 0) {
                    // buy new drum
                    if (savings - drumsSetCopy.get(i) * 3 >= 0) {
                        savings = savings - drumsSetCopy.get(i) * 3;
                        drum = drumsSetCopy.get(i);
                    } else {
                        drumsSetCopy.set(i, 0);
                    }
                }
                drumsSet.set(i, drum);
            }
            drumsSet.removeIf(drum -> drum <= 0);
            drumsSetCopy.removeIf(drum -> drum <= 0);
            if (drumsSet.isEmpty()) break;
            command = scanner.nextLine();
        }
        System.out.println(drumsSet.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}

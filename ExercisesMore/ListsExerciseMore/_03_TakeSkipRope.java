package ExercisesMore.ListsExerciseMore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rope = scanner.nextLine();
        List<Character> charList = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        {
            List<Integer> numList = new ArrayList<>();
            for (int i = 0; i < rope.length(); i++) {
                char symbol = rope.charAt(i);
                if (symbol >= '0' && symbol < '9') {
                    numList.add(Integer.parseInt("" + symbol));
                } else {
                    charList.add(symbol);
                }
            }
            for (int i = 0; i < numList.size(); i++) {
                if (i % 2 == 0) takeList.add(numList.get(i));
                else skipList.add(numList.get(i));

            }
        }

        int index = 0;
        String output = "";
        while(index < charList.size()
                && !skipList.isEmpty()) {
            for (int i = index; (i < index + takeList.get(0)) && i < charList.size(); i++) {
                output += (charList.get(i));
            }
            index += takeList.get(0);
            takeList.remove(0);
            index = index + skipList.get(0);
            skipList.remove(0);
        }
        System.out.println(output);
    }
}

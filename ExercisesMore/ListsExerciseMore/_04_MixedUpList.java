package ExercisesMore.ListsExerciseMore;

import java.util.*;
import java.util.stream.Collectors;

public class _04_MixedUpList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mixedList = new ArrayList<>();
        int size = Math.min(listOne.size(), listTwo.size());
        while (size > 0) {
            mixedList.add(listOne.get(0));
            listOne.remove(0);
            mixedList.add(listTwo.get(listTwo.size() - 1));
            listTwo.remove(listTwo.size() - 1);
            size--;
        }

        int minBoundary= listOne.isEmpty() ?
                Math.min(listTwo.get(0),listTwo.get(1)) : Math.min(listOne.get(0),listOne.get(1));
        int maxBoundary = listOne.isEmpty() ?
                Math.max(listTwo.get(0),listTwo.get(1)) : Math.max(listOne.get(0),listOne.get(1));

        List<Integer> result = new ArrayList<>();
        for (int element : mixedList) {
            if (element > minBoundary && element < maxBoundary) {
                result.add(element);
            }
        }
        Collections.sort(result);
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}

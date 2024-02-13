package Labs.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> listMerged = new ArrayList<>();
        while (!listOne.isEmpty() && !listTwo.isEmpty()) {
            listMerged.add(listOne.get(0));
            listMerged.add(listTwo.get(0));
            listOne.remove(0);
            listTwo.remove(0);
        }
        listMerged.addAll(listOne);
        listMerged.addAll(listTwo);
        System.out.println(listMerged.toString().replaceAll("[\\[\\],]",""));
    }
}

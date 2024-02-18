package Exams.ExamPreparation._20240214_;

import java.util.*;
import java.util.stream.Collectors;

public class _03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted().collect(Collectors.toList());

        Collections.reverse(list);
        double average = ((double)(Collections.max(list) + Collections.min(list))) / 2;
        List<Integer> output = new ArrayList<>();
        for (int element : list) {
            if (element > average && output.size() < 5) output.add(element);
        }
        if (output.isEmpty()) System.out.print("No");
        else System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
        System.out.println();
    }
}

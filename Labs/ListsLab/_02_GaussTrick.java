package Labs.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> gaussList = new ArrayList<Integer>();

        while(list.size() > 1) {
            gaussList.add(list.get(0) + list.get(list.size() - 1));
            list.remove(0);
            list.remove(list.size() - 1);
        }
        if(list.size() == 1) gaussList.add(list.get(0));

        System.out.println(gaussList.toString().replaceAll("[\\[\\],]", ""));
    }
}

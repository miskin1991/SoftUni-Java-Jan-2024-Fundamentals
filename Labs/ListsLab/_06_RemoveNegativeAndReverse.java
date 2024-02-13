package Labs.ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        list.removeIf(n -> n < 0);
        if(list.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(list);
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

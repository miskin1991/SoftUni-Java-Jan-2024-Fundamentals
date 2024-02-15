package Exercises.ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> arrayOfData = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String[] tokens = command.split(" ");
            if (tokens[0].equals("merge")) {
                int startIndex = Integer.parseInt(tokens[1]);
                if (startIndex < 0) startIndex = 0;
                int endIndex = Integer.parseInt(tokens[2]);
                if (endIndex >= arrayOfData.size()) endIndex = arrayOfData.size() - 1;
                if ((startIndex < arrayOfData.size()) && (endIndex > startIndex)) {
                    for (int i = 0; i < endIndex - startIndex; i++) {
                        arrayOfData.set(startIndex, arrayOfData.get(startIndex) + arrayOfData.get(startIndex + 1));
                        arrayOfData.remove(startIndex + 1);
                    }
                }
            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);
                List<String> subDataArray = getSubDataArray(partitions, arrayOfData, index);
                arrayOfData.addAll(index, subDataArray);
                arrayOfData.remove(index + subDataArray.size());
            }
            command = scanner.nextLine();
        }
        System.out.println(arrayOfData.toString()
                .replaceAll("[\\[\\],]", ""));
    }

    private static List<String> getSubDataArray(int partitions, List<String> arrayOfData, int index) {
        String element = arrayOfData.get(index);
        if (partitions == 0) {
            List<String> subDataArray = new ArrayList<>();
            subDataArray.add(element);
            return  subDataArray;
        }
        int length = element.length() / partitions;
        List<String> subDataArray = new ArrayList<>();
        int subIndex = 0;
        while (partitions > 1) {
            subDataArray.add(element.substring(subIndex, subIndex + length));
            subIndex += length;
            partitions--;
        }
        subDataArray.add(element.substring(subIndex));
        return subDataArray;
    }
}

// abcd efgh ijkl mnop qrst uvwx yz

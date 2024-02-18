package Exams.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shelf = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] tokens = command.split(" \\| ");
            switch (tokens[0]) {
                case "Add Book": {
                    String name = tokens[1];
                    if(!shelf.contains(name)) shelf.add(0, name);
                    break;
                }
                case "Take Book": {
                    String name = tokens[1];
                    shelf.remove(name);
                    break;
                }
                case "Swap Books": {
                    String nameOne = tokens[1];
                    String nameTwo = tokens[2];
                    if (shelf.contains(nameOne) && shelf.contains(nameTwo)) {
                        int indexOfOne = shelf.indexOf(nameOne);
                        int indexOfTwo = shelf.indexOf(nameTwo);
                        shelf.set(indexOfOne, nameTwo);
                        shelf.set(indexOfTwo, nameOne);
                    }
                    break;
                }
                case "Insert Book": {
                    String name = tokens[1];
                    if(!shelf.contains(name)) shelf.add(name);
                    break;
                }
                case "Check Book": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < shelf.size()) System.out.println(shelf.get(index));
                    break;
                }
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(shelf.toString().replaceAll("[\\[\\]]", ""));
    }
}

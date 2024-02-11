package ExercisesMore.MethodExerciseMore;

import java.util.Arrays;
import java.util.Scanner;

public class _06_ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int commandsCounter = 2;
        while(!command.equals("end") && commandsCounter <= 50) {
            String[] tokens = command.split(" ");
            int index;
            int count;
            switch (tokens[0]) {
                case "exchange":
                    index = Integer.parseInt(tokens[1]);
                    array = exchangeArray(index, array);
                    break;
                case "max":
                    if (tokens[1].equals("even")) {
                        index = maxEvenIndex(array);
                    } else index = maxOddIndex(array);
                    if (index > -1) System.out.println(index);
                    else System.out.println("No matches");
                    break;
                case "min":
                    if (tokens[1].equals("even")) {
                        index = minEvenIndex(array);
                    } else index = minOddIndex(array);
                    if (index > -1) System.out.println(index);
                    else System.out.println("No matches");
                    break;
                case "first":
                    count = Integer.parseInt(tokens[1]);
                    if(tokens[2].equals("even")) firstEvenElements(array, count);
                    else firstOddElements(array, count);
                    break;
                case "last":
                    count = Integer.parseInt(tokens[1]);
                    if(tokens[2].equals("even")) lastEvenElements(array, count);
                    else lastOddElements(array, count);
                    break;
            }
            command = scanner.nextLine();
            commandsCounter++;
        }
        printArray(array);
    }

    private static int[] exchangeArray(int index, int[] array) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid index");
            return array;
        }
        int[] result = new int[array.length];
        // move second part at the beginning
        int count = 0;
        for (int i = index + 1; i < array.length; i++, count++) {
            result[count] = array[i];
        }
        // move first part at the end
        for (int i = 0; i <= index; i++, count++) {
            result[count] = array[i];
        }
        return result;
    }
    private static int maxEvenIndex(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    private static int maxOddIndex(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    private static int minEvenIndex(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    private static int minOddIndex(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    private static void firstEvenElements(int[] array, int count) {
        if(count > array.length) {
            System.out.println("Invalid count");
        } else {
            String outArray = "";
            for (int i = 0; i < array.length && count > 0; i++) {
                if(array[i] % 2 == 0) {
                    outArray += array[i] + " ";
                    count--;
                }
            }
            if(!outArray.isEmpty()) {
                int[] result = Arrays.stream(outArray.split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                printArray(result);
            } else printArray(new int[0]);
        }
    }
    private static void firstOddElements(int[] array, int count) {
        if(count > array.length) {
            System.out.println("Invalid count");
        } else {
            String outArray = "";
            for (int i = 0; i < array.length && count > 0; i++) {
                if(array[i] % 2 != 0) {
                   outArray += array[i] + " ";
                   count--;
                }
            }
            if(!outArray.isEmpty()) {
                int[] result = Arrays.stream(outArray.split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                printArray(result);
            } else printArray(new int[0]);
        }
    }
    private static void lastEvenElements(int[] array, int count) {
        if (count > array.length) {
            System.out.println("Invalid count");
        } else {
            String outArray = "";
            for (int i = array.length - 1; i >= 0 && count > 0; i--) {
                if (array[i] % 2 == 0) {
                    outArray += array[i] + " ";
                    count--;
                }
            }
            if (!outArray.isEmpty()) {
                int[] result = Arrays.stream(outArray.split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                result = reverseArray(result);
                printArray(result);
            } else printArray(new int[0]);
        }
    }
    private static void lastOddElements(int[] array, int count){
        if(count > array.length) {
            System.out.println("Invalid count");
        } else {
            String outArray = "";
            for (int i = array.length - 1; i >= 0 && count > 0; i--) {
                if(array[i] % 2 != 0) {
                    outArray += array[i] + " ";
                    count--;
                }
            }
            if(!outArray.isEmpty()) {
                int[] result = Arrays.stream(outArray.split(" "))
                        .mapToInt(Integer::parseInt).toArray();
                result = reverseArray(result);
                printArray(result);
            } else printArray(new int[0]);
        }
    }
    private static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        if(array.length > 0)
            System.out.printf("%d]%n", array[array.length - 1]);
        else
            System.out.println("]");
    }
    private static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for(int i = 0, j = array.length -1; i < array.length; i++, j--){
            reverse[i] = array[j];
        }
        return reverse;
    }
}

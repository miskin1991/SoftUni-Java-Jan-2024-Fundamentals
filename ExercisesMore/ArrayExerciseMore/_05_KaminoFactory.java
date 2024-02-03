package ExercisesMore.ArrayExerciseMore;

import java.util.Arrays;
import java.util.Scanner;

public class _05_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] bestDna = new int[n];
        int bestLengthOfOnes = 0; // stores the length of the longest subsequence of ones
        int lowestIndexOfOnesSeq = 0; // stores the leftmost starting index
        int biggestOnesSum = 0; // stores the sum of ones in the bestDna
        int bestSequenceIndex = 0; // stores the input index (order)
        int index = 0;
        String input = scanner.nextLine();
        while(!input.equals("Clone them!")) {
            index++;
            int count = 0;
            int[] dna = Arrays.stream(input.split("!+"))
                    .mapToInt(Integer::parseInt).toArray();
            int[] len = new int[dna.length]; // array to store the value of the subsequences found
            int[] pos = new int[dna.length]; // array to store the first position of the subsequences found

            // We set the first element before entering the counting algorithm.
            if (dna[0] == 0) {
                len[0] = 0;
                pos[0] = -1;
            } else {
                len[0] = 1;
                pos[0] = 0;
                count++;
            }
            // run the counting algorithm
            for (int i = 1; i < dna.length; i++) {
                if (dna[i] == 1) {
                    // if previous element has pos -1 -> it was a 0 -> take current position index
                    if(pos[i - 1] == -1) {
                        pos[i] = i;
                    }
                    // previous element was 1 -> copy previous position index
                    else {
                        pos[i] = pos[i - 1];
                    }
                    // increase subsequence length
                    len[i] = len[i - 1] + 1;
                    // increase total ones counter
                    count++;
                } else {
                    len[i] = 0;
                    pos[i] = -1;
                }
            }

            // get the largest subsequence in the current dna
            int max = Arrays.stream(len).max().getAsInt();
            // do verification to select if it is the best dna
            if(max > bestLengthOfOnes) { // it is the best dna
                bestDna = dna;
                bestLengthOfOnes = max;
                biggestOnesSum = count;
                lowestIndexOfOnesSeq = pos[findIndex(len, max)];
                bestSequenceIndex = index;
            } else if (max == bestLengthOfOnes) { // largest subsequence are identical
                int indexOfMax = pos[findIndex(len, max)];
                if (indexOfMax < lowestIndexOfOnesSeq) { // check which is the lowest index
                    bestDna = dna;
                    biggestOnesSum = count;
                    lowestIndexOfOnesSeq = indexOfMax;
                    bestSequenceIndex = index;
                } else if (indexOfMax == lowestIndexOfOnesSeq) { // lowest index identical -> compare ones sum
                    if (biggestOnesSum < count) {
                        bestDna = dna;
                        biggestOnesSum = count;
                        bestSequenceIndex = index;
                    }
                }
            }
            input = scanner.nextLine();
        }
        if(index > 0) {
            System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, biggestOnesSum);
            for (int element : bestDna) System.out.printf("%d ", element);
        }
    }

    /**
     * This method will go by len array and will get the index of the cell that contains the searched value
     * @param array: array to search in
     * @param valueToFind: value to search
     * @return index where the valueToFind is located in the array
     */
    private static int findIndex(int[] array, int valueToFind) {
        int i = 0;
        while(i < array.length) {
            if (array[i] == valueToFind) break;
            i++;
        }
        return i;
    }
}

// 100/100
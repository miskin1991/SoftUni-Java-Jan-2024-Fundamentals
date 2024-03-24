package ExercisesMore.MapsExerciseMore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class _02_Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashMap<String, LinkedHashMap<String, Integer>> contests = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> totalScores = new LinkedHashMap<>();
        while (!input.equals("no more time")) {
            String[] tokens = input.split(" -> ");
            String name = tokens[0];
            String contest = tokens[1];
            int score = Integer.parseInt(tokens[2]);
            // add entry
            if (contests.containsKey(contest)) {
                LinkedHashMap<String, Integer> participants = contests.get(contest);
                if (participants.containsKey(name)) {
                    Integer currScore = participants.get(name);
                    if (currScore < score) {
                        participants.put(name, score);
                        if (totalScores.containsKey(name)) {
                            totalScores.put(name, totalScores.get(name) - currScore + score);
                        } else {
                            totalScores.put(name, score);
                        }
                    }
                } else {
                    participants.put(name, score);
                    if (totalScores.containsKey(name))
                        totalScores.put(name, totalScores.get(name) + score);
                    else
                        totalScores.put(name, score);
                }
            } else {
                contests.put(contest, new LinkedHashMap<>());
                contests.get(contest).put(name, score);
                if (totalScores.containsKey(name))
                    totalScores.put(name, totalScores.get(name) + score);
                else
                    totalScores.put(name, score);
            }
            input = scanner.nextLine();
        }

        for (Entry<String, LinkedHashMap<String, Integer>> contest : contests.entrySet()) {
            orderMapByValue(contest.getValue());
        }
        orderMapByValue(totalScores);

        for (Entry<String, LinkedHashMap<String, Integer>> contest : contests.entrySet()) {
            System.out.printf("%s: %d participants%n", contest.getKey(), contest.getValue().size());
            int i = 1;
            for (Entry<String, Integer> participant : contest.getValue().entrySet()) {
                System.out.printf("%d. %s <::> %d%n", i++, participant.getKey(), participant.getValue());
            }
        }

        System.out.println("Individual standings:");
        int i = 1;
        for (Entry<String, Integer> totalScore : totalScores.entrySet()) {
            System.out.printf("%d. %s -> %d%n", i++, totalScore.getKey(), totalScore.getValue());
        }
    }

    private static void orderMapByValue(LinkedHashMap<String, Integer> map) {
        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        map.clear();
        getSorted(list);
        for (Entry<String, Integer> element : list) {
            map.put(element.getKey(), element.getValue());
        }
    }

    private static void getSorted(List<Entry<String, Integer>> list) {
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                if (o2.getValue().equals(o1.getValue())) {
                    char[] first = o1.getKey().toLowerCase().toCharArray();
                    char[] second = o2.getKey().toLowerCase().toCharArray();
                    int minLength = Math.min(first.length, second.length);
                    for (int i = 0; i < minLength; i++) {
                        if (first[i] != second[i]) {
                            return first[i] - second[i];
                        }
                    }
                    if (first.length < second.length) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
                return o2.getValue() - o1.getValue();
            }
        });
    }
}

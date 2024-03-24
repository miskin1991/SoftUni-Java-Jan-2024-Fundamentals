package ExercisesMore.MapsExerciseMore;

import java.util.*;
import java.util.Map.Entry;

public class _03_MobaChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, LinkedHashMap<String, Integer>> playerPool = new LinkedHashMap<>();
        while (!input.equals("Season end")) {
            if (input.contains(" vs ")) {
                // duel request
                String[] tokens = input.split(" vs ");
                String p1 = tokens[0];
                String p2 = tokens[1];
                if (playerPool.containsKey(p1) && playerPool.containsKey(p2)) {
                    // find position for duel
                    for (Entry<String, Integer> position : playerPool.get(p1).entrySet()) {
                        if (playerPool.get(p2).containsKey(position.getKey())) {
                            // duel happens
                            int p1Skill = position.getValue();
                            int p2Skill = playerPool.get(p2).get(position.getKey());
                            if (p1Skill < p2Skill) {
                                playerPool.remove(p1);
                            } else if (p1Skill > p2Skill) {
                                playerPool.remove(p2);
                            }
                            // duel happened, break loop
                            break;
                        }
                    }
                }
            } else if (input.contains(" -> ")) {
                String[] tokens = input.split(" -> ");
                String player = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);
                if (playerPool.containsKey(player)) {
                    if (playerPool.get(player).containsKey(position)) {
                        int currentSkill = playerPool.get(player).get(position);
                        if (currentSkill < skill) {
                            playerPool.get(player).put(position, skill);
                        }
                    } else {
                        playerPool.get(player).put(position, skill);
                    }
                } else {
                    playerPool.put(player, new LinkedHashMap<>());
                    playerPool.get(player).put(position, skill);
                }
            }
            input = scanner.nextLine();
        }

        // Order players skill by value
        LinkedHashMap<String, Integer> playerTotalSkills = new LinkedHashMap<>();
        for (Entry<String, LinkedHashMap<String, Integer>> player : playerPool.entrySet()) {
            orderMapByValue(player.getValue());
            // Add player to total skill map
            int totalSkill = 0;
            for (int skill : player.getValue().values()) {
                totalSkill += skill;
            }
            playerTotalSkills.put(player.getKey(), totalSkill);
        }
        orderMapByValue(playerTotalSkills);

        for (Entry<String, Integer> playerTotalSkill : playerTotalSkills.entrySet()) {
            System.out.printf("%s: %d skill%n", playerTotalSkill.getKey(), playerTotalSkill.getValue());
            for(Entry<String, Integer> skill : playerPool.get(playerTotalSkill.getKey()).entrySet()) {
                System.out.printf("- %s <::> %d%n", skill.getKey(), skill.getValue());
            }
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

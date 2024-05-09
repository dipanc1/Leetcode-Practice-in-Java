import java.util.*;

class Solution267 {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sortedScore = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);

        String[] medals = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        Map<Integer, String> rankMapping = new HashMap<>();

        for (int i = 0; i < sortedScore.length; i++) {
            if (i < 3) {
                rankMapping.put(sortedScore[i], medals[i]);
            } else {
                rankMapping.put(sortedScore[i], String.valueOf(i + 1));
            }
        }

        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            result[i] = rankMapping.get(score[i]);
        }

        return result;

    }
}

public class relative_ranks {
    public static void main(String[] args) {
        Solution267 s = new Solution267();
        System.out.println(Arrays.toString(s.findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }
}

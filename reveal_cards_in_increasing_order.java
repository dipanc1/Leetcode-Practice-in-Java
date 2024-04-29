import java.util.*;

class Solution242 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] res = new int[deck.length];

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < deck.length; i++) {
            queue.add(i);
        }

        for (int d : deck) {
            int i = queue.poll();
            res[i] = d;

            if (!queue.isEmpty()) queue.add(queue.poll());
        }

        return res;
    }
}

public class reveal_cards_in_increasing_order {
    public static void main(String[] args) {
        Solution242 s = new Solution242();
        System.out.println(Arrays.toString(s.deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})));
    }
}

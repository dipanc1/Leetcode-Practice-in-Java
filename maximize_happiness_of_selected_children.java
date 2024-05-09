import java.util.Arrays;

class Solution268 {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        int j = 0;
        Arrays.sort(happiness);

        for (int i = happiness.length - 1; i >= happiness.length - k; i--) {
            happiness[i] = Math.max(happiness[i] - j++, 0);
            ans += happiness[i];
        }

        return ans;
    }
}

public class maximize_happiness_of_selected_children {
    public static void main(String[] args) {
        Solution268 s = new Solution268();
        System.out.println(s.maximumHappinessSum(new int[]{2, 3, 4, 5}, 2));
    }
}

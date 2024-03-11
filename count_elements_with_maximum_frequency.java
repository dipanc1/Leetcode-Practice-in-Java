import java.util.Arrays;
import java.util.HashMap;

class Solution217 {
    public int maxFrequencyElements(int[] nums) {
        int ans = 0;
        int maxFreq = Integer.MIN_VALUE;
        int[] count = new int[nums.length + 1];

        for (int num : nums) count[num]++;
        for (int i : count) maxFreq = Math.max(maxFreq, i);
        for (int n : nums) if (maxFreq == count[n]) ans++;

        return ans;
    }
}

public class count_elements_with_maximum_frequency {
    public static void main(String[] args) {
        Solution217 s = new Solution217();
        System.out.println(s.maxFrequencyElements(new int[]{1, 2, 3, 4, 5}));
    }
}

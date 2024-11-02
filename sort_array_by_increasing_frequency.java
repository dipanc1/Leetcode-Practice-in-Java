import java.util.*;

class Solution299 {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        Integer[] numsObj = new Integer[n];

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            numsObj[i] = nums[i];
        }

        Arrays.sort(numsObj, (a, b) -> {
            if (!Objects.equals(map.get(a), map.get(b))) {
                return map.get(a) - map.get(b);
            }
            return b - a;
        });

        for (int i = 0; i < n; i++) {
            nums[i] = numsObj[i];
        }

        return nums;
    }
}

public class sort_array_by_increasing_frequency {
    public static void main(String[] args) {
        Solution299 s = new Solution299();
        System.out.println(Arrays.toString(s.frequencySort(new int[]{5, 3, 1, 1, 2, 2, 2})));
    }
}

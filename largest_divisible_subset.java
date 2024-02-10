import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution202 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
//        int n = nums.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp, 1);
//        Arrays.sort(nums);
//
//        int maxSize = 1, maxIndex = 0;
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                if (nums[i] % nums[j] == 0) {
//                    dp[i] = Math.max(dp[i], dp[j] + 1);
//                    if (dp[i] > maxSize) {
//                        maxSize = dp[i];
//                        maxIndex = i;
//                    }
//                }
//            }
//        }
//
//        List<Integer> result = new ArrayList<>();
//        int num = nums[maxIndex];
//        for (int i = maxIndex; i >= 0; i--) {
//            if (num % nums[i] == 0 && dp[i] == maxSize) {
//                result.add(nums[i]);
//                num = nums[i];
//                maxSize--;
//            }
//        }
//
//        return result;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        Arrays.sort(nums);
        int[] hash = new int[nums.length];

        int maxi = -1;
        int lastIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            hash[i] = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
            }
            if (dp[i] > maxi) {
                maxi = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> lst = new ArrayList<Integer>();
        lst.add(nums[lastIndex]);
        while (hash[lastIndex] != lastIndex) {
            lastIndex = hash[lastIndex];
            lst.add(nums[lastIndex]);


        }
        return lst;
    }
}

public class largest_divisible_subset {
    public static void main(String[] args) {
        Solution202 s = new Solution202();
        System.out.println(s.largestDivisibleSubset(new int[]{1, 2, 3}));
    }
}

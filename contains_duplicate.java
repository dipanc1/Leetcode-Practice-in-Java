import java.util.HashSet;

class Solution148 {
    public boolean containsDuplicate(int[] nums) {
        // using hashset
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])) return true;
            hashSet.add(nums[i]);
        }
        return false;
    }
}

public class contains_duplicate {
    public static void main(String[] args) {
        Solution148 s = new Solution148();
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println(s.containsDuplicate(nums));
    }
}

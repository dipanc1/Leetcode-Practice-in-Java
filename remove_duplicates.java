import java.util.HashSet;

class Solution5 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        for (int num : nums) {
            s1.add(num);
        }
        return s1.size();
    }
}

public class remove_duplicates {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.removeDuplicates(new int[]{1, 1, 2}));
    }
}

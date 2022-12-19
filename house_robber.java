import java.util.List;

class Solution20 {
    public int rob(int[] nums) {
        int curMax = 0;
        int preMax = 0;
        for(int num: nums) {
            int temp = curMax;
            curMax = Math.max(num+preMax, curMax);
            preMax = temp;
        }

        return curMax;
    }
}

public class house_robber {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        System.out.println(s.rob(new int[] {1,2,3,1}));
    }
}

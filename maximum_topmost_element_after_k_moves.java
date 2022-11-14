class Solution18 {
    public int maximumTop(int[] nums, int k) {
        int len = nums.length, max = -1;

        if(len == 1){
            if(k%2 == 1) return -1;
            else return nums[0];
        }

        if (k < len) max = nums[k];
        else if (k > len) {
            k = len + 1;
        }

        for (int i = 0; i < k - 1; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;

    }
}

public class maximum_topmost_element_after_k_moves {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(s.maximumTop(new int[] {5,2,2,4,0,6}, 4));
    }
}

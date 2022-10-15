class Solution6 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=target)
            {
                return i;
            }
        }
        return nums.length;
    }
}

public class search_insert_position {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        System.out.println(s.searchInsert(new int[]{1,3,5,6}, 7));
    }
}

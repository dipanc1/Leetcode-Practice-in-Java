class Solution211 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int sum = n * (n + 1) / 2;

        for (int ne : nums) {
            totalSum += ne;
        }

        return sum - totalSum;
    }
}

public class missing_number {
    public static void main(String[] args) {
        Solution211 s = new Solution211();
        System.out.println(s.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}

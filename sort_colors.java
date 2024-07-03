class Solution290 {

    public void sortColors(int[] nums) {
        int zeroCnt = 0, oneCnt = 0, twoCnt = 0;

        for (int n : nums) {
            if (n == 0) zeroCnt++;
            else if (n == 1) {
                oneCnt++;
            } else twoCnt++;
        }

        int idx = 0;

        for (int i = 0; i < zeroCnt; i++) {
            nums[idx] = 0;
            idx++;
        }

        for (int i = 0; i < oneCnt; i++) {
            nums[idx] = 1;
            idx++;
        }

        for (int i = 0; i < twoCnt; i++) {
            nums[idx] = 2;
            idx++;
        }
    }

}

public class sort_colors {
    public static void main(String[] args) {
        Solution290 s = new Solution290();
        s.sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }
}

class Solution243 {
    public int trap(int[] height) {
//        int[] leftMax = new int[height.length];
//        leftMax[0] = height[0];
//
//        for (int i = 1; i < height.length; i++) {
//            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//        }
//
//        int[] rightMax = new int[height.length];
//        rightMax[height.length - 1] = height[height.length - 1];
//
//        for (int i = height.length - 2; i >= 0; i--) {
//            rightMax[i] = Math.max(height[i], rightMax[i+1]);
//        }
//
//        int trappedWater = 0;
//        for (int i = 0; i < height.length;i++) {
//            int waterLevel = Math.min(leftMax[i], rightMax[i]);
//            trappedWater += waterLevel - height[i];
//        }
//
//        return trappedWater;

        int i = 0, leftMax = height[0], sum = 0, j = height.length - 1, rightMax = height[height.length - 1];

        while (i < j) {
            if (leftMax <= rightMax) {
                sum += leftMax - height[i];
                i++;
                leftMax = Math.max(leftMax, height[i]);
            } else {
                sum += rightMax - height[j];
                j--;
                rightMax = Math.max(rightMax, height[j]);
            }
        }

        return sum;
    }
}

public class trapping_rain_water {
    public static void main(String[] args) {
        Solution243 s = new Solution243();
        System.out.println(s.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}

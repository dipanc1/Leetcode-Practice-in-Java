class Solution28 {
    public int maxAbsValExpr(int[] arr1, int[] arr2) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                max = Math.max(max, (Math.abs(arr1[i] - arr1[j])) + Math.abs(arr2[i]-arr2[j])+Math.abs(i-j));
            }
        }
        return max;
    }
}
public class maximum_of_absolute_value_expression {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        System.out.println(s.maxAbsValExpr(new int[]{1,2,3,4},new int[]{-1,4,5,6}));
    }
}

class Solution212 {
    public int rangeBitwiseAnd(int left, int right) {
        int i = 0;

        while (left != right) {
            left = left >> 1;
            right = right >> 1;
            i += 1;
        }
        return left << i;
    }
}

public class bitwise_and_of_numbers_range {
    public static void main(String[] args) {
        Solution212 s = new Solution212();
        System.out.println(s.rangeBitwiseAnd(5, 7));
    }
}

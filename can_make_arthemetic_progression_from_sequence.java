import java.util.Arrays;

class Solution105 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            if ((arr[i] - arr[i - 1]) == (arr[i - 1] - arr[i - 2])) return true;
        }
        return false;
    }
}

public class can_make_arthemetic_progression_from_sequence {
    public static void main(String[] args) {
        Solution105 s = new Solution105();
        System.out.println(s.canMakeArithmeticProgression(new int[]{3, 5, 1}));
    }
}

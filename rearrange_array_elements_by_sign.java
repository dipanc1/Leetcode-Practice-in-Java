import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution207 {
    public int[] rearrangeArray(int[] nums) {
//        List<Integer> posArr = new ArrayList<>();
//        List<Integer> negArr = new ArrayList<>();
//        int n = nums.length;
//        List<Integer> res = new ArrayList<>();
//
//        for (int num : nums) {
//            if (num > 0) posArr.add(num);
//            else negArr.add(num);
//        }
//
////        int index1 = 0, index2 = 0;
////
////        while (index2 < n / 2) {
////            res.add(posArr.get(index1));
////            index1++;
////            res.add(negArr.get(index2));
////            index2++;
////        }
//
//        for (int i = 0; i < n / 2; i++) {
//            res.add(posArr.get(i));
//            res.add(negArr.get(i));
//        }
//
//        return res.stream().mapToInt(Integer::intValue).toArray();

        int[] res = new int[nums.length];
        int pos = 0, neg = 1;

        for (int num : nums) {
            if (num > 0) {
                res[pos] = num;
                pos += 2;
            } else {
                res[neg] = num;
                neg += 2;
            }
        }

        return res;
    }
}

public class rearrange_array_elements_by_sign {
    public static void main(String[] args) {
        Solution207 s = new Solution207();
        System.out.println(Arrays.toString(s.rearrangeArray(new int[]{3, 1, -2, -5, 2, -4})));
    }
}

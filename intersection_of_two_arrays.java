import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution219 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i)) {
                arrayList.add(i);
                map.remove(i);
            }
        }

        int[] result = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }


        return result;

    }
}

public class intersection_of_two_arrays {
    public static void main(String[] args) {
        Solution219 s = new Solution219();
        System.out.println(Arrays.toString(s.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }
}

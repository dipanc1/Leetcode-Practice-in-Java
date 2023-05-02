import java.util.ArrayList;
import java.util.List;

class Solution64 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanList = new ArrayList<>();
        int highestNumber = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > highestNumber) highestNumber = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            booleanList.add((candies[i] + extraCandies) >= highestNumber);
        }
        return booleanList;
    }
}

public class greatest_number_of_candies {
    public static void main(String[] args) {
        Solution64 s = new Solution64();
        System.out.println(s.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1));
    }
}

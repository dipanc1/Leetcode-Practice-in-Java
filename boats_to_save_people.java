import java.util.Arrays;

class Solution265 {
    public int numRescueBoats(int[] people, int limit) {
        int[] buckets = new int[limit + 1];

        for (int w : people) buckets[w]++;

        int boats = 0, i = 0, j = buckets.length - 1;

//        Arrays.sort(people);

        while (i <= j) {
            while (i <= j && buckets[i] <= 0) i++;
            while (i <= j && buckets[j] <= 0) j--;

            if (people[i] <= 0 && people[j] <= 0) {
                break;
            }

            boats++;

//            if (i + j <= limit) buckets[i]--;
//            buckets[j]--;
        }

        return boats;
    }
}

public class boats_to_save_people {
    public static void main(String[] args) {
        Solution265 s = new Solution265();
        System.out.println(s.numRescueBoats(new int[]{1, 2}, 3));
    }
}

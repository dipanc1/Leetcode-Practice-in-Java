import java.util.Arrays;
import java.util.Map;

class Solution291 {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int res = 0;

        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }

        return res;
    }
}

public class minimum_number_of_moves_to_seat_everyone {
    public static void main(String[] args) {
        Solution291 s = new Solution291();
        System.out.println(s.minMovesToSeat(new int[]{3, 1, 5}, new int[]{2, 7, 4}));
    }
}

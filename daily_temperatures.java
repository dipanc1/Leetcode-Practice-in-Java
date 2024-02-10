import java.util.Arrays;
import java.util.Stack;

class Solution23 {
    public int[] dailyTemperatures(int[] temperatures) {
//        Stack<Integer> stack = new Stack<>();
//        int[] res = new int[temperatures.length];
//
//        for (int i = 0; i < temperatures.length; i++) {
//            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
//                int idx = stack.pop();
//                res[idx] = i - idx;
//            }
//            stack.push(i);
//        }
//
//        return res;

        int n = temperatures.length;

        int hottest = 0;

        int[] answer = new int[n];

        for (int currDay = n - 1; currDay >= 0; currDay--) {

            int currentTemp = temperatures[currDay];

            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;

            while (temperatures[currDay + days] < currentTemp) {
                days += answer[currDay + days];
            }

            answer[currDay] = days;
        }

        return answer;
    }
}

public class daily_temperatures {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        System.out.println(Arrays.toString(s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        //      1,  1,  4,  2,  1,  1,  0,  0
    }
}

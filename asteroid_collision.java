import java.util.Arrays;
import java.util.Stack;

class Solution132 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            while (!stack.isEmpty() && asteroids[i] < 0 && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i]))
                stack.pop();

            if (stack.isEmpty() || stack.peek() < 0 || asteroids[i] > 0) stack.push(asteroids[i]);
            else if (stack.peek() == Math.abs(asteroids[i])) stack.pop();

        }

        int n = stack.size();
        int[] ans = new int[stack.size()];
        while (n > 0) ans[--n] = stack.pop();
        return ans;
    }
}

public class asteroid_collision {
    public static void main(String[] args) {
        Solution132 s = new Solution132();
        System.out.println(Arrays.toString(s.asteroidCollision(new int[]{-2, -2, 1, 1})));
    }
}

import java.util.Arrays;

class Solution90 {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        return lcm(A,B);
    }

    private static Long gcd(Long a, Long b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
    private static Long[] lcm(Long a, Long b) {
        Long first =  (a / gcd(a, b)) * b;
        Long[] longs = new Long[2];

        longs[0] = first;
        longs[1] = gcd(a, b);
        return longs;
    }

};
public class lcm_and_gcd {
    public static void main(String[] args) {
        Solution90 s = new Solution90();
        System.out.println(Arrays.toString(s.lcmAndGcd(14L, 8L)));
    }
}

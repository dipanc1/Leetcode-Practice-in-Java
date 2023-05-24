import static java.lang.Long.parseLong;

class Solution88 {
    static Long reversedBits(Long X) {
        // code here
        Long dec = 0L;
        Long mul = 1L;
        for (int i = 1; i <= 31; i++) {
            mul *=2;
        }

        while(X!=0){
            Long rem = X%2;
            dec += mul*rem;
            mul = mul/2;
            X = X/2;
        }
        return dec;
    }
};
public class reverse_bits {
    public static void main(String[] args) {
        Solution88 s = new Solution88();
        System.out.println(s.reversedBits(1L));
    }
}

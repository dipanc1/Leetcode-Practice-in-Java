import java.math.BigInteger;

class Solution44 {
    public String addBinary(String a, String b) {
        return new BigInteger(a,2).add(new BigInteger(b,2)).toString(2);
    }
}
public class add_binary {
    public static void main(String[] args) {
        Solution44 s = new Solution44();
        System.out.println(s.addBinary("11","1"));
    }
}

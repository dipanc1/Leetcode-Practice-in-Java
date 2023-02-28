class Solution36 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1))  return "";

        int gcdVal = gcd(str1.length() , str2.length());
        return str2.substring(0, gcdVal);
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
}
public class greatest_common_divisor_of_strings {
    public static void main(String[] args) {
        Solution36 s = new Solution36();
        System.out.println(s.gcdOfStrings("ABABAB", "ABAB"));
    }
}

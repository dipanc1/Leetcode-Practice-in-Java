class Solution216 {
    public int minimumLength(String s) {
        int l = 0, r = s.length() - 1, temp = -1;

        while (l < r && s.charAt(l) == s.charAt(r)) {
            temp = s.charAt(l);

            while (l <= r && s.charAt(l) == temp) {
                l++;
            }


            while (l <= r && s.charAt(r) == temp) {
                r--;
            }

        }
        return (r - l + 1);
    }
}

public class minimum_length_of_string_after_deleting_similar_ends {
    public static void main(String[] args) {
        Solution216 s = new Solution216();
        System.out.println(s.minimumLength("ca"));
    }
}

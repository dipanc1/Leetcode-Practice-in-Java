class Solution50 {
    public int compress(char[] chars) {
        int i = 0, j = 0;
        while (j < chars.length) {
            int count = 0;
            char curr = chars[j];
            while (j < chars.length && chars[j] == curr) {
                j++;
                count++;
            }
            chars[i++] = curr;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray())
                    chars[i++] = c;
            }
        }
        return i;
    }
}

public class string_compression {
    public static void main(String[] args) {
        Solution50 s = new Solution50();
        System.out.println(s.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}

class Solution75 {
    public static boolean check(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
    }

    public int maxVowels(String s, int k) {
        int max = 0, n = s.length(), count = 0;
        for (int i = 0; i < k; i++) {
            if (check(s.charAt(i))) count++;
        }

        max = count;

        for (int i = k; i < n; i++) {
            if (check(s.charAt(i - k))) count--;
            if (check(s.charAt(i))) count++;
            max = Math.max(max, count);
        }
        return max;
    }
}

public class maximum_number_of_vowels_in_substring_of_given_length {
    public static void main(String[] args) {
        Solution75 s = new Solution75();
        System.out.println(s.maxVowels("abciiidef", 3));
    }
}

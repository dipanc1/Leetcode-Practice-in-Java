class Solution113 {
    public char nextGreatestLetter(char[] letters, char target) {
        int i = 0;
        int j = letters.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (letters[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return letters[i % letters.length];
    }
}

public class find_smallest_target_greater_than_the_target {
    public static void main(String[] args) {
        Solution113 s = new Solution113();
        System.out.println(s.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
    }
}

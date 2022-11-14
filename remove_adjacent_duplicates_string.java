class Solution17 {
    public String removeDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char first = stringBuilder.charAt(i);
            char second = stringBuilder.charAt(i + 1);
            if (first == second){
                stringBuilder.delete(i, i + 2);
                i = i == 0 ? i - 1 : i - 2;
            }
        }
        return stringBuilder.toString();
    }
}

public class remove_adjacent_duplicates_string {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        System.out.println(s.removeDuplicates("azxxzy"));
    }
}

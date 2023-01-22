class Solution27 {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length-1; j++) {
                if (strs[j].charAt(i) > strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
public class min_deletion_size {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        System.out.println(s.minDeletionSize(new String[]{"cba","daf","ghf"}));
    }
}

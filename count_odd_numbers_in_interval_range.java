
class Solution42 {
    public int countOdds(int low, int high) {
       int nums = high - low + 1;

       if (low%2 !=0 && high%2 !=0){
           return nums/2 + 1;
       } else {
           return nums/2;
       }
    }
}
public class count_odd_numbers_in_interval_range {
    public static void main(String[] args) {
        Solution42 s = new Solution42();
        System.out.println(s.countOdds(3,7));
    }
}

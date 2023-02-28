class Solution33 {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0){
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
public class valid_perfect_square {
    public static void main(String[] args) {
        Solution33 s = new Solution33();
        System.out.println(s.isPerfectSquare(16));
    }
}

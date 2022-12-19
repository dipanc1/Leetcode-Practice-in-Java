class Solution22 {
    public int countEven(int num) {
        int temp = num;
        int sum = 0;

        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }

        return sum % 2 == 0 ? temp/2 : (temp- 1)/2;

    }
}
public class count_integers_with_even_digit_sum {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        System.out.println(s.countEven(30));
    }
}

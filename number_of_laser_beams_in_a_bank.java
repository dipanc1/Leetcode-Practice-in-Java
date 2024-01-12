class Solution182 {
    public int numberOfBeams(String[] bank) {
        int ans = 0;

        for (int i = 0; i < bank.length - 1; i++) {
            int prev = countOnes(bank[i]);
            for (int j = i + 1; j < bank.length; j++) {
                int curr = countOnes(bank[j]);
                ans += prev * curr;
            }

        }

        return ans;
    }

    private int countOnes(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '1') count++;
        }

        return count;
    }
}

public class number_of_laser_beams_in_a_bank {
    public static void main(String[] args) {
        Solution182 s = new Solution182();
        System.out.println(s.numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
    }
}

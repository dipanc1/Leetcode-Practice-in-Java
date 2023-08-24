class Solution127 {
    public int minBitFlips(int start, int goal) {
        String startBit = bit(start);
        String goalBit = bit(goal);
        int count = 0;
        System.out.println(startBit + " " + goalBit);
        for (int i = 0; i < goalBit.length(); i++) {
            if (startBit.toCharArray()[i] != goalBit.toCharArray()[i]) count++;
        }
        return count;
    }

    public String bit(int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                res.append("1");
            else
                res.append("0");
        }
        return res.toString();
    }
}

public class minimum_bit_flips_to_convert_number {
    public static void main(String[] args) {
        Solution127 s = new Solution127();
        System.out.println(s.minBitFlips(10, 7));
    }
}


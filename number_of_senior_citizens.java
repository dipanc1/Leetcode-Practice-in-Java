class Solution305 {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String s : details) {
            int age = 0;
            age += s.charAt(12) - '0';
            age += (s.charAt(11) - '0') * 10;
            if (age > 60) count++;
        }

        return count;
    }
}

public class number_of_senior_citizens {
    public static void main(String[] args) {
        Solution305 s = new Solution305();
        System.out.println(s.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}));
    }
}

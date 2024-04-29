class Solution237 {
    public int maxDepth(String s) {
        int counter = 0, maxCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] == '(') counter++;
            maxCounter = Math.max(maxCounter, counter);
            if (s.toCharArray()[i] == ')') counter--;
        }

        return maxCounter;
    }
}

public class maximum_nesting_depth_of_the_parentheses {
    public static void main(String[] args) {
        Solution237 s = new Solution237();
        System.out.println(s.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}

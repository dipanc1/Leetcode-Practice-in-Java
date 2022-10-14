import java.util.ArrayList;
import java.util.Stack;

class Solution4 {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char a:s.toCharArray())
        {
            //Check if stack not empty and the top element corresponds to curr char
            if(!st.isEmpty() && (st.peek()==a-1 || st.peek()==a-2))
                st.pop();
                //else these might be starting brackets or unsatisfied closing brackets
            else
                st.push(a);

        }

        return st.isEmpty();
    }
}

public class valid_parentheses {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.isValid("()"));
    }
}

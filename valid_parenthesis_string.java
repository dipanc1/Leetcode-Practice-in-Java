import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution239 {
    public boolean checkValidString(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//
//        for (char c : s.toCharArray()) {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//
//        if (map.get(')') == null) return false;
//        if (map.get('(') == null) return false;
//
//        if ((map.get('(') > map.get(')')) && (map.get('*') == (map.get('(') - map.get(')')))) return true;
//        else if ((map.get(')') > map.get('(')) && (map.get('*') == (map.get(')') - map.get('(')))) return true;
//        else return Objects.equals(map.get('('), map.get(')'));

        int leftCount = 0, rightCount = 0;

        for (char c : s.toCharArray()) {
            leftCount += c == '(' ? 1 : -1;
            rightCount += c == ')' ? -1 : 1;

            if (rightCount < 0) break;
            leftCount = Math.max(leftCount, 0);
        }

        return leftCount == 0;
    }
}

public class valid_parenthesis_string {
    public static void main(String[] args) {
        Solution239 s = new Solution239();
        System.out.println(s.checkValidString("((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()"));
    }
}

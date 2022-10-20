import java.util.ArrayList;
import java.util.List;

class Solution10 {

    public void generate(Integer left, Integer right, ArrayList<String> result, String string){
        if(left == 0 && right == 0){
            result.add(string);
            return;
        }

        // backtracking here
        if(left > 0){
            generate(left - 1, right, result, string + "(");
        }
        if (right > left){
            generate(left, right -1, result, string +")");
        }

    }
    public List<String> generateParenthesis(int n) {
        Integer left = n;
        Integer right = n;
        ArrayList<String> result = new ArrayList<>();
        String string = "";

        generate(left, right, result, string);

        return result;
    }
}

public class generate_parentheses {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        System.out.println(s.generateParenthesis(3));
    }
}

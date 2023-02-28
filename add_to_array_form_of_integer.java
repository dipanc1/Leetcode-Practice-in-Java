import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution45 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        int len=num.length-1;
        while(len>=0 || k>0){
            if(len>=0){
                k+=num[len--];
            }
            res.addFirst(k%10);
            k/=10;
        }
        return res;
    }
}
public class add_to_array_form_of_integer {
    public static void main(String[] args) {
        Solution45 s = new Solution45();
        System.out.println(s.addToArrayForm(new int[] {1,2,0,0}, 34));
    }
}

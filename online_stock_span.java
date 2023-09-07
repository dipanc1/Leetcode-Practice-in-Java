import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

class StockSpanner {
//    LinkedList<Integer> st;
//    HashMap<Integer, Integer> map;
//
//    public StockSpanner() {
//        st = new LinkedList<>();
//        map = new HashMap<>();
//    }
//
//    public int next(int price) {
//        int count = 1;
//        while (!st.isEmpty() && st.getFirst() <= price) {
//            count += map.get(st.removeFirst());
//        }
//        map.put(price, count);
//        st.addFirst(price);
//        return count;
//    }

    ArrayList<Integer> arrayList;
    Stack<Integer> st;

    public StockSpanner() {
        st = new Stack<>();
        arrayList = new ArrayList<>();
    }

    public int next(int price) {
        while (!st.isEmpty() && arrayList.get(st.peek()) <= price) {
            st.pop();
        }
        arrayList.add(price);
        if (st.isEmpty()) {
            st.push(arrayList.size() - 1);
            return arrayList.size();
        } else {
            int val = st.peek();
            st.push(arrayList.size() - 1);
            return arrayList.size() - 1 - val;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

public class online_stock_span {
    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        stockSpanner.next(100); // return 1
        stockSpanner.next(80);  // return 1
        stockSpanner.next(60);  // return 1
        stockSpanner.next(70);  // return 2
        stockSpanner.next(60);  // return 1
        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85);  // return 6
    }
}

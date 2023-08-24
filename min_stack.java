import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

class MinStack {

    List<Integer> list;
    PriorityQueue<Integer> priorityQueue;

    public MinStack() {
        list = new ArrayList<>();
        priorityQueue = new PriorityQueue<>();
    }

    public void push(int val) {
        list.add(val);
        priorityQueue.offer(val);
    }

    public void pop() {
        Integer n = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        priorityQueue.remove(n);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return priorityQueue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class min_stack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        System.out.println(minStack);
    }
}

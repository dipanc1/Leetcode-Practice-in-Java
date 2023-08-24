import java.util.LinkedList;
import java.util.Queue;

class MyStack {

//    public int top;
//    public int[] arr;
//
//    public MyStack() {
//        top = -1;
//        arr = new int[100];
//    }
//
//    public void push(int x) {
//        top++;
//        arr[top] = x;
//    }
//
//    public int pop() {
//        int temp = arr[top];
//        top--;
//        return temp;
//    }
//
//    public int top() {
//        return arr[top];
//    }
//
//    public boolean empty() {
//        return top != 0;
//    }

    Queue<Integer> queue;
    int top;

    public MyStack() {
        queue = new LinkedList<>();
        top = 0;
    }

    public void push(int x) {
        queue.offer(x);
        top = x;
    }

    public int pop() {
        int size = queue.size();
        while (size > 2) {
            queue.offer(queue.poll());
            size--;
        }
        top = queue.peek();
        queue.offer(queue.poll());
        return queue.poll();
    }

    public int top() {
        return this.top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
public class implement_stack_using_queues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        System.out.println(stack);
    }
}

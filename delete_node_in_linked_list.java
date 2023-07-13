class Solution116 {
    private boolean hasCycle(ListNode head, ListNode slow, ListNode fast) {
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        boolean isCyclePresent = hasCycle(head, fast, slow);

        if (!isCyclePresent) return null; // no cycle return

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }
}

public class delete_node_in_linked_list {
    public static void main(String[] args) {
        Solution116 s = new Solution116();
    }
}

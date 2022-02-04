package LinkedList;

public class MergeLinkedList {
    public static class ListNode{
        public int val;
        public ReArrange.ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        ReArrange.ListNode head = insert(1,null);
        insert(1, head);
        insert(2,head);
        insert (2, head);
        insert(8, head);

        insert(8, head);
        insert(9, head);
        ReArrange.ListNode h;
    }
    public static ReArrange.ListNode insert(int n, ReArrange.ListNode head) {
        if ( head == null) {
            return new ReArrange.ListNode(n);
        }
        ReArrange.ListNode current = head;
        while (current.next != null) {
            current  = current.next;
        }
        current.next = new ReArrange.ListNode(n);
        return head;
    }
    public static ReArrange.ListNode merge(ReArrange.ListNode A, ReArrange.ListNode B) {
        ReArrange.ListNode h3 = new ReArrange.ListNode(-1);
        ReArrange.ListNode tail = h3;
        while(A != null && B != null) {
            if (A.val > B.val) {
                tail.next = B;
                tail = tail.next;
                B = B.next;
                tail.next = null;
            } else {
                tail.next = A;
                tail = tail.next;
                A = A.next;
                tail.next = null;
            }
            if(A != null) {
                tail.next = A;
            }
            if(B != null) {
                tail.next = B;
            }
        }
        return h3.next;
    }
}

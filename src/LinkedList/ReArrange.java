package LinkedList;

import java.util.List;

public class ReArrange {
    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
         ListNode head = insert(1,null);
        insert(1, head);
        insert(2,head);
        insert (2, head);
        insert(8, head);

        insert(8, head);
        insert(9, head);
        ListNode h;
        h = reorderList(head);

    }
    public static ListNode insert(int n,ListNode head) {
        if ( head == null) {
            return new ListNode(n);
        }
       ListNode current = head;
        while (current.next != null) {
            current  = current.next;
        }
        current.next = new ListNode(n);
        return head;
    }
    public static ListNode reorderList(ListNode A) {
        ListNode m = mid(A);
        ListNode h2 = m.next;
        m.next = null;
        h2 = reverseLL(h2);
        return merge(A,h2);

    }
    public static ListNode reverseLL(ListNode A) {
        ListNode p1 = null;
        ListNode p2 = A;
        ListNode p3 = null;
        while(p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    public static ListNode mid(ListNode A) {
        if(A == null) return null;
        ListNode slow = A;
        ListNode fast = A;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode merge(ListNode h1,ListNode h2) {
        ListNode curr = h1;
        ListNode temp;
        while(h2 != null) {
            temp = h2;
            h2 = h2.next;
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }
        return h1;
    }
}


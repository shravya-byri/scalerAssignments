package LinkedList;


public class ReverseLL {
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
        insert(2, head);
        insert(3,head);
        insert (8, head);
        insert(9, head);
        insert(10, head);
        ListNode newhead = reverseBetween(head,2,3);
        printLL(newhead);

    }
    public static void printLL(ListNode head) {
        ListNode curr = head;
        while( curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();

    }

    public static ListNode insert(int n, ListNode head) {
        if ( head == null) {
            return new ListNode(n);
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(n);
        return head;
    }

    public static ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode prev = A;
        ListNode nxt = A;
        int B1 = B;
        int C1 = C;
        if (A.next == null) return A;
        while (B > 2) {
            prev = prev.next;
            B--;
        }
        while (C > 0 && nxt != null) {
            nxt = nxt.next;
            C--;
        }
        ListNode P = prev.next;
        ListNode P1 = P.next;
        while (B1 <= C1 && P1 != null) {
            P.next = nxt;
            nxt = P;
            P = P1;
            P1 = P1.next;
            B1++;
        }
        prev.next = nxt;
        return A;
    }
}


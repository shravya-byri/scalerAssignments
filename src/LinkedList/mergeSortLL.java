package LinkedList;


public class mergeSortLL {
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
        ListNode h = sortList(head);


    }
    public static ListNode insert(int n, ListNode head) {
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


    public static ListNode sortList(ListNode A) {
        if(A == null) return A;
        return mergeSort(A);
    }
    public static ListNode mergeSort(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode m = middle(A);
        ListNode head2 = m.next;
        m.next = null;
        A = mergeSort(A);
        head2 = mergeSort(head2);
        return merge(A,head2);


    }

    public static ListNode merge(ListNode A, ListNode head2) {
        ListNode h3 = new ListNode(-1);
        ListNode tail = h3;
        while(A != null && head2 != null) {
            if (A.val > head2.val) {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
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
            if(head2 != null) {
                tail.next = head2;
            }
        }
        return h3.next;

    }
    public static ListNode middle(ListNode A) {
        if(A == null) return null;
        ListNode slow = A;
        ListNode fast = A;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}


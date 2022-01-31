package LinkedList;

public class RemoveDuplicates {
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
        printLL(head);
        removeDuplicates(head);
        printLL(head);
    }
    public static void printLL(ListNode head) {
        ListNode curr = head;
        while( curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        System.out.println();

    }
    public static ListNode removeDuplicates(ListNode head) {
        ListNode temp = head;
        if(head.next == null) return head;
        while(temp.next != null) {
            if(temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else temp = temp.next;
        }
        return head;
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
}

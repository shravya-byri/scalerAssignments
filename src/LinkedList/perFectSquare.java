package LinkedList;

public class perFectSquare {
    public static class ListNode{
        public int val;
        public RemoveDuplicates.ListNode next;
        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static void main(String[] args) {
        RemoveDuplicates.ListNode head = insert(1,null);
        insert(1, head);
        insert(2,head);
        insert (2, head);
        insert(8, head);

        insert(8, head);
        insert(9, head);



    }
    public static RemoveDuplicates.ListNode insert(int n, RemoveDuplicates.ListNode head) {
        if ( head == null) {
            return new RemoveDuplicates.ListNode(n);
        }
        RemoveDuplicates.ListNode current = head;
        while (current.next != null) {
            current  = current.next;
        }
        current.next = new RemoveDuplicates.ListNode(n);
        return head;
    }

   public static int nextPerfectSquare(int N) {
        if(checkPerfectSquare(N) == true) return N;
       int nextN = (int) Math.floor(Math.sqrt(N)) + 1;

       return nextN * nextN;
   }
    static boolean checkPerfectSquare(int number)
    {

        double sqrt=Math.sqrt(number);

        return ((sqrt - Math.floor(sqrt)) == 0);
    }
}

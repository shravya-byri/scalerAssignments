package Stack;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(List.of(4,2,3,1,4));
        System.out.println(solve(4,B));
    }
    public static int solve(int A, ArrayList<Integer> B) {
        Deque<Integer> deq = new LinkedList<>();
        for(int i = 0; i < B.size();i++) {
            deq.add(B.get(i));
        }
        int count = 0;
        while(deq.getFirst() <= A){
            count++;
            deq.pollFirst();
        }
        while (deq.getLast() <= A && !deq.isEmpty()) {
            count++;
            deq.pollLast();
        }
        return count;
    }
}

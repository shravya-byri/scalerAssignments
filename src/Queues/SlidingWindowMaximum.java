package Queues;

import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, -1, -3, 5, 3, 6, 7));
        System.out.println(solve(A,3));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < B; i++) {
            while ((!dq.isEmpty() && dq.getLast() < A.get(i))) {
                dq.pollLast();
            }
            dq.addLast(A.get(i));
        }
        res.add(dq.getFirst());
        for(int i = B; i < A.size(); i++) {
            while ((!dq.isEmpty() && dq.getLast() < A.get(i))) {
                dq.pollLast();
            }
            dq.addLast(A.get(i));
            if(Objects.equals(A.get(i - B), dq.getFirst())) {
                dq.pollFirst();
            }
            res.add(dq.getFirst());
        }

        return res;
    }
}

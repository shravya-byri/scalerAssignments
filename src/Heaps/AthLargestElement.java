package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class AthLargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(solve(4,B));
    }
    public static ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0;i < A;i++) {
            pq.add(B.get(i));
            if(i!=A-1)
                res.add(-1);
        }
        res.add(pq.peek());
        for(int i=A;i<B.size();i++) {
            pq.add(B.get(i));
            pq.poll();
            res.add(pq.peek());
        }
        return res;
    }
}

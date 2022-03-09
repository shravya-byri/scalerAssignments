package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KPlacesApart {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 40, 2, 3));
        System.out.println(solve(A,2));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>();
        for(int i = 0; i <= B; i++) {
            pqr.add(A.get(i));
        }
        for(int i = B+1; i < A.size(); i++) {
            if(A.get(i) > pqr.peek()){
                res.add(pqr.poll());
                pqr.add(A.get(i));
            }
        }
        while(!pqr.isEmpty()) {
            res.add(pqr.poll());
        }
        return res;
    }
}

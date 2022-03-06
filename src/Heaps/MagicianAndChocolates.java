package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
    public static void main(String[] args) {
        ArrayList<Integer> B = new ArrayList<>(List.of(2, 4, 6, 8, 10));
        System.out.println(solve(5,B));
    }
    public static int solve(int A, ArrayList<Integer> B) {
        long ans = 0;
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.addAll(B);
        while(A > 0 && !pqr.isEmpty()) {
            int temp = pqr.poll();
            ans = (ans +  temp) % 1000000007;
            pqr.add(temp/2);
            A--;
        }
        return (int)ans % 1000000007;
    }
}

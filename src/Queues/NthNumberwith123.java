package Queues;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NthNumberwith123 {
    public static void main(String[] args) {
        System.out.println(solve(220));
    }
    public static ArrayList<Integer> solve(int A) {
        Queue<Integer> que = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        if(A == 1) {
            ans.add(1);
            return ans;
        }
        if(A == 2) {
            ans.add(1);
            ans.add(2);
            return ans;
        }
        if(A == 3) {
            ans.add(1);
            ans.add(2);
            ans.add(3);
            return ans;
        }
        ans.add(1);
        ans.add(2);
        ans.add(3);
        int count = 3;
        int top;
        int num = 3;
        while (count < A) {
            top = que.peek();
            que.remove();
            for (int i = 1; i <= 3; i++) {
                if (count < A) {
                    num = top * 10 + i;
                    que.add(num);
                    ans.add(num);
                    count++;
                } else return ans;
            }
        }

     return ans;
    }
}

package Queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(solve(100000));
    }
    public static String solve(int A) {
        StringBuilder ans = new StringBuilder();
        Queue<Long> que = new PriorityQueue<>();
        que.add(1L);
        que.add(2L);
        if(A == 1) {
            ans.append(1);
            return ans + ans.reverse().toString();
        }
        if(A == 2) {
            ans.append(2);
            return ans + ans.reverse().toString();
        }
        int count = 2;
        long top;
        long num = 2;
        while (count < A) {
            top = que.peek();
            que.remove();
            for (int i = 1; i <= 2; i++) {
                if (count < A) {
                    num = top * 10 + i;
                    que.add(num);
                    count++;
                } else {
                    ans.append(num).toString();
                    return ans.toString() + ans.reverse().toString() ;
                }
            }
        }
        ans.append(num).toString();

         return ans.toString() + ans.reverse().toString() ;
    }
}

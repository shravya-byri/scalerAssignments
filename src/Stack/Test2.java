package Stack;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(3,4,5));
        System.out.println(solve(A,8));
    }
    public static int solve(ArrayList<Integer> A, int B) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < A.size(); i++) {
            st.push(A.get(i));
            que.add(A.get(i));
        }
        int count1 = 0;
        int sum1 = 0;
        int count2 = 0;
        int sum2 = 0;
        while(sum1 < B && !st.isEmpty()) {
            sum1 = sum1 + st.pop();
            if(sum1 <= B)
               count1++;
        }
        while(sum2 < B && !que.isEmpty()) {
            sum2 = sum2 + que.poll();
            if(sum2 <= B)
               count2++;

        }
        return Math.max(count1,count2);

    }
}

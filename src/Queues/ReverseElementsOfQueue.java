package Queues;

import java.util.*;

public class ReverseElementsOfQueue {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(solve(A,3));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < B; i++) {
          st.push(A.get(i));
        }
        for(int i = 0; i < B; i++){
            A.set(i,st.peek());
            st.pop();
        }
        return A;
    }
}

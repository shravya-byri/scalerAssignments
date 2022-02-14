package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(4, 5, 2, 10, 8));
        System.out.println(solve(A));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>(); //stores probable ans for upcoming elements

        for(int i = 0; i < A.size();i++) {
            while(!st.empty() && A.get(i) <= st.peek()) {
              st.pop();
            }
            if(st.empty()) res.add(-1);
            else res.add(st.peek());
            st.push(A.get(i));

        }
        return res;
    }
}

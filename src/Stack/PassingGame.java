package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PassingGame {
    public static void main(String[] args) {
      int A = 10;
      int B = 23;
        ArrayList<Integer>  C = new ArrayList<>(List.of(86, 63, 60, 0, 47, 0, 99, 9, 0, 0));
        System.out.println(solve(A,B,C));
    }
    public static int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> st = new Stack<>();
        st.push(B);
        while(A > 0) {
            for(int i = 0; i < C.size(); i++) {
                if(C.get(i) == 0) {
                    st.pop();
                }else st.push(C.get(i));
                A--;
            }
        }
        return st.peek();
    }
}

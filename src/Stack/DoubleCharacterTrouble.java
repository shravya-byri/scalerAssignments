package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        String A = "abccc";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if(!st.isEmpty() && st.peek() == A.charAt(i)){
                st.pop();
            } else st.push(A.charAt(i));
        }
        StringBuilder ans = new StringBuilder();

         while(!st.isEmpty()) {
            ans.append(st.peek());
            st.pop();
        }

      return ans.reverse().toString();
    }
}

package Stack;

import java.util.Stack;

public class SimplifyDirectoryPath {
    public static void main(String[] args) {
        String A = "/../";
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < A.length();i++) {
            st.push(A.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        st.pop();
        while(st.peek() != '/') {
            if(st.peek() != '.') {
                ans.append(st.peek());
            }
            st.pop();
        }
        ans.append('/');
        return ans.reverse().toString();
    }
}

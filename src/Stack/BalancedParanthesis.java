package Stack;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String A = ")))))))";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        HashMap<Character,Character> hash = new HashMap<>();
        Stack<Character> st = new Stack<>();
        hash.put('(',')');
        hash.put('{','}');
        hash.put('[',']');
        for(int i = 0; i < A.length();i++) {
            if(hash.containsKey(A.charAt(i))) {
                st.push(A.charAt(i));
            } else {
                if(!st.isEmpty() && hash.get(st.peek()) == A.charAt(i)) {
                    st.pop();
                } else return 0;
            }
        }
        if(st.isEmpty()) return 1;
        else return 0;
    }

}

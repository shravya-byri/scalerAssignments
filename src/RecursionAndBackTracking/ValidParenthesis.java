package RecursionAndBackTracking;

import java.util.ArrayList;
import java.util.HashSet;

public class ValidParenthesis {
    public static void main(String[] args) {
       System.out.println( solve(4));
    }
    public static ArrayList<String> solve(int A ) {
        HashSet<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder();
        generateParenthesis(str,0,0,A,set);
        ArrayList<String> res = new ArrayList<>(set);
        return res;

    }
    public static void generateParenthesis(StringBuilder str, int O, int C, int A,HashSet<String> set) {
        if(O > A || C > A) return;
        if(O < C) return;
        if(O == C && C == A) {
            set.add(str.toString());
        }
            generateParenthesis(str.append("("),O+1,C,A,set);
            str.deleteCharAt(str.length()-1);
            generateParenthesis(str.append(")"),O,C+1,A,set);
            str.deleteCharAt(str.length()-1);

    }
}

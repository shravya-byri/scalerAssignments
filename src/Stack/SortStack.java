package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of( 5,17,100,11));

        System.out.println(sortedStack(A));

    }
    public static ArrayList<Integer> sortedStack(ArrayList<Integer> A) {
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i <  A.size(); i++) {
            s2.add(-1);
        }
        int top = -1;
        int tops2 = -1;
        int n = A.size()-1;
        while(top != n) {
            int x = A.get(n);
            n--;
            while(tops2 != -1 && x < s2.get(tops2) ) {
                n = n+1;
                A.set(n,s2.get(tops2));
                tops2--;
            }
            tops2 = tops2 + 1;
            s2.set(tops2,x);
        }
        return s2;

    }
}

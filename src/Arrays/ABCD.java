package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ABCD {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1,3,4,6,7));
        solve(A);
    }
    public static void solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size()-1;
        int a;int b; int c; int d;
        for(int i = 0;i < A.size()-1;i++) {
            for(int j = i+1; j < A.size(); j++){
                a = A.get(i);
                b = A.get(n-j+1);
                c = A.get(j);
                d = A.get(n-j);
                if(a == c + d - b && a!= b && b != c && c != d){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(d);
                    return;
                }

            }
        }
        System.out.println("tuss");

    }
}

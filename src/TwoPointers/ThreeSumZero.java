package TwoPointers;

import java.util.*;

public class ThreeSumZero {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(-4, 2, -1, 1, -4, 2, -5, -3, 2));
        System.out.println(solve(A));
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int j;
        int i = 0;
        int k;
        Collections.sort(A);
     //   System.out.println(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        while(i < A.size()-2) {
            j = i+1; k = A.size()-1;
            while (j < k) {
                if(A.get(i)+ A.get(j)+A.get(k) < 0) {
                  j++;
                } else if (A.get(i)+A.get(j)+A.get(k) > 0) {
                    k--;
                } else {
                    if(i != j && i != k) {
                        while(k >= 1 && Objects.equals(A.get(k), A.get(k - 1))) {
                            k--;
                        }
                        while( j <= A.size()-2 && Objects.equals(A.get(j), A.get(j + 1))) {
                            j++;
                        }
                        ArrayList<Integer> sub = new ArrayList<>();
                        sub.add(A.get(i));
                        sub.add(A.get(j));
                        sub.add(A.get(k));
                        ans.add(sub);
                        k--;
                    }else if( i == j) {
                        j++;
                    }else {
                        k--;
                    }
                }
            }
            i++;
        }
        LinkedHashSet<ArrayList<Integer>> fin = new LinkedHashSet<>(ans);
        ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>(fin);
        return ans1;
    }
}
